package com.sample;

import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.billinghouse.jooq.dentalcrm.tables.Contacts;
import com.billinghouse.jooq.dentalcrm.tables.records.ContactsRecord;

@Component
public class CommandLine implements CommandLineRunner {
	@Autowired
	DataAccess dataAccess;

	@Override
	public void run(String... args) throws Exception {
		Result<ContactsRecord> records = dataAccess.crmDb.selectFrom(
				Contacts.CONTACTS).fetch();

		for (ContactsRecord record : records) {
			System.out.println("Contact found: " + record.getFirstName() + " "
					+ record.getLastName());
		}
	}

}
