/**
 * This class is generated by jOOQ
 */
package com.billinghouse.jooq.dentalcrm;


import com.billinghouse.jooq.dentalcrm.tables.Contacts;
import com.billinghouse.jooq.dentalcrm.tables.ContactsBugs;
import com.billinghouse.jooq.dentalcrm.tables.ContactsCases;
import com.billinghouse.jooq.dentalcrm.tables.ContactsCstm;
import com.billinghouse.jooq.dentalcrm.tables.ContactsUsers;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in dentalcrm
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table dentalcrm.contacts
	 */
	public static final Contacts CONTACTS = com.billinghouse.jooq.dentalcrm.tables.Contacts.CONTACTS;

	/**
	 * The table dentalcrm.contacts_bugs
	 */
	public static final ContactsBugs CONTACTS_BUGS = com.billinghouse.jooq.dentalcrm.tables.ContactsBugs.CONTACTS_BUGS;

	/**
	 * The table dentalcrm.contacts_cases
	 */
	public static final ContactsCases CONTACTS_CASES = com.billinghouse.jooq.dentalcrm.tables.ContactsCases.CONTACTS_CASES;

	/**
	 * The table dentalcrm.contacts_cstm
	 */
	public static final ContactsCstm CONTACTS_CSTM = com.billinghouse.jooq.dentalcrm.tables.ContactsCstm.CONTACTS_CSTM;

	/**
	 * The table dentalcrm.contacts_users
	 */
	public static final ContactsUsers CONTACTS_USERS = com.billinghouse.jooq.dentalcrm.tables.ContactsUsers.CONTACTS_USERS;
}
