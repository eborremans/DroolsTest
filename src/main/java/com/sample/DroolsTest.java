package com.sample;

import java.math.BigDecimal;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.jooq.Record;
import org.jooq.Result;
import com.billinghouse.jooq.dentalcrm.*;

import com.billinghouse.jooq.dentalcrm.tables.Contacts;
import com.billinghouse.jooq.dentalcrm.tables.records.ContactsRecord;
import com.sample.ItemCity.City;
import com.sample.ItemCity.Type;

/* This is a sample class to launch a rule. */

public class DroolsTest {
	public static final void main(String[] args) {
		try {

			// itemCityExample();
			// personExample();
			jooqExample();

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private static void jooqExample() {
		DataAccess dataAccess = new DataAccess();
		
//		Result<ContactsRecord> records = dataAccess.crmDb.selectFrom(Contacts.CONTACTS).fetch();
//		
//		for(ContactsRecord record : records) {
//			System.out.println("Contact found: " + record.getFirstName() + " " + record.getLastName());
//		}
			
	}
	
	private static void personExample() throws Exception {
		// load up the knowledge base
		KnowledgeBase kbase = readKnowledgeBase();
		StatefulKnowledgeSession ksession = kbase
				.newStatefulKnowledgeSession();

		Person famke = new Person("famke", 10);
		ksession.insert(famke);

		Person lukas = new Person("lukas", 13);
		ksession.insert(lukas);

		Person thomas = new Person("thomas", 17);
		ksession.insert(thomas);

		Person tony = new Person("tony", 50);
		tony.addChild(famke);
		tony.addChild(lukas);
		tony.addChild(thomas);
		ksession.insert(tony);
		
		Person bas = new Person("bas", 8);
		ksession.insert(bas);

		Person wim = new Person("wim", 48);
		wim.addChild(bas);
		ksession.insert(wim);

		Person karlijn = new Person("karlijn", 16);
		ksession.insert(karlijn);

		Person pepijn = new Person("pepijn", 14);
		ksession.insert(pepijn);

		Person eddy = new Person("eddy", 50);
		eddy.addChild(karlijn);
		eddy.addChild(pepijn);
		ksession.insert(eddy);

		Person klaartje = new Person("klaartje", 51);
		ksession.insert(klaartje);
		
		ksession.insert(12);

		ksession.fireAllRules();
	}

	private static void itemCityExample() throws Exception {
		// load up the knowledge base
		KnowledgeBase kbase = readKnowledgeBase();
		StatefulKnowledgeSession ksession = kbase
				.newStatefulKnowledgeSession();

		ItemCity item1 = new ItemCity();
		item1.setPurchaseCity(City.PUNE);
		item1.setTypeofItem(Type.MEDICINES);
		item1.setSellPrice(new BigDecimal(10));
		ksession.insert(item1);

		ItemCity item2 = new ItemCity();
		item2.setPurchaseCity(City.PUNE);
		item2.setTypeofItem(Type.GROCERIES);
		item2.setSellPrice(new BigDecimal(10));
		ksession.insert(item2);

		ItemCity item3 = new ItemCity();
		item3.setPurchaseCity(City.NAGPUR);
		item3.setTypeofItem(Type.MEDICINES);
		item3.setSellPrice(new BigDecimal(10));
		ksession.insert(item3);

		ItemCity item4 = new ItemCity();
		item4.setPurchaseCity(City.NAGPUR);
		item4.setTypeofItem(Type.GROCERIES);
		item4.setSellPrice(new BigDecimal(10));
		ksession.insert(item4);

		ksession.fireAllRules();

		System.out.println(item1.getPurchaseCity().toString() + " "
				+ item1.getLocalTax().intValue());

		System.out.println(item2.getPurchaseCity().toString() + " "
				+ item2.getLocalTax().intValue());

		System.out.println(item3.getPurchaseCity().toString() + " "
				+ item3.getLocalTax().intValue());

		System.out.println(item4.getPurchaseCity().toString() + " "
				+ item4.getLocalTax().intValue());
	}

	private static KnowledgeBase readKnowledgeBase() throws Exception {

		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();

//		kbuilder.add(ResourceFactory.newClassPathResource("Pune.drl"),
//				ResourceType.DRL);
//		kbuilder.add(ResourceFactory.newClassPathResource("Nagpur.drl"),
//		ResourceType.DRL);
		kbuilder.add(ResourceFactory.newClassPathResource("Person.drl"),
		ResourceType.DRL);

		KnowledgeBuilderErrors errors = kbuilder.getErrors();

		if (errors.size() > 0) {
			for (KnowledgeBuilderError error : errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}

		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

		return kbase;
	}
}