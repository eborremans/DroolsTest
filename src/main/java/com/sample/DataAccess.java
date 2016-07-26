//spring.datasource.testWhileIdle = true
//spring.datasource.timeBetweenEvictionRunsMillis = 3600000
//spring.datasource.testOnBorrow=true
//spring.datasource.validationQuery=SELECT 1
//
//spring.datasource.rts.url = jdbc:postgresql://localhost/rts_mp
//spring.datasource.rts.username = jbilling
//spring.datasource.rts.password = jbilling
//spring.datasource.rts.driverClassName = org.postgresql.Driver
//
//spring.datasource.rts.testOnBorrow=true
//spring.datasource.rts.validationQuery=SELECT 1
//spring.datasource.rts.testWhileIdle = true
//spring.datasource.rts.timeBetweenEvictionRunsMillis = 3600000
//spring.datasource.rts.validationQuery = SELECT 1
//
//spring.datasource.crm.url = jdbc:mysql://localhost/suitecrm?useLegacyDatetimeCode=false&serverTimezone=UTC
//spring.datasource.crm.username = root
//spring.datasource.crm.password =
//spring.datasource.crm.driverClassName = com.mysql.jdbc.Driver
//
//spring.datasource.crm.testOnBorrow=true
//spring.datasource.crm.validationQuery=SELECT 1
//spring.datasource.crm.testWhileIdle = true
//spring.datasource.crm.timeBetweenEvictionRunsMillis = 3600000
//spring.datasource.crm.validationQuery = SELECT 1

package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;

import com.billinghouse.jooq.dentalcrm.tables.Contacts;
import com.billinghouse.jooq.dentalcrm.tables.interfaces.IContacts;
import com.billinghouse.jooq.dentalcrm.tables.records.ContactsRecord;

public class DataAccess {
	public DSLContext crmDb = null;
	public Connection connection = null;

	public DataAccess() {
		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://127.0.0.1/dentalcrm?useLegacyDatetimeCode=false&serverTimezone=UTC";
		//String url = "jdbc:mysql://127.0.0.1/dentalcrm";

		// Connection is the only JDBC resource that we need
		// PreparedStatement and ResultSet are handled by jOOQ, internally
		try (Connection conn = DriverManager.getConnection(url, userName,
				password)) {
			crmDb = DSL.using(conn, SQLDialect.MYSQL);
			
			Result<ContactsRecord> records = crmDb.selectFrom(Contacts.CONTACTS).fetch();
			
			for(ContactsRecord record : records) {
				System.out.println("Contact found: " + record.getFirstName() + " " + record.getLastName());
			}
		}

		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void storeContact(IContacts contact) {

	}
}
