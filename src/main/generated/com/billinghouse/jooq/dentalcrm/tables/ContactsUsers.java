/**
 * This class is generated by jOOQ
 */
package com.billinghouse.jooq.dentalcrm.tables;


import com.billinghouse.jooq.dentalcrm.Dentalcrm;
import com.billinghouse.jooq.dentalcrm.Keys;
import com.billinghouse.jooq.dentalcrm.tables.records.ContactsUsersRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContactsUsers extends TableImpl<ContactsUsersRecord> {

	private static final long serialVersionUID = -26822314;

	/**
	 * The reference instance of <code>dentalcrm.contacts_users</code>
	 */
	public static final ContactsUsers CONTACTS_USERS = new ContactsUsers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ContactsUsersRecord> getRecordType() {
		return ContactsUsersRecord.class;
	}

	/**
	 * The column <code>dentalcrm.contacts_users.id</code>.
	 */
	public final TableField<ContactsUsersRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>dentalcrm.contacts_users.contact_id</code>.
	 */
	public final TableField<ContactsUsersRecord, String> CONTACT_ID = createField("contact_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * The column <code>dentalcrm.contacts_users.user_id</code>.
	 */
	public final TableField<ContactsUsersRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * The column <code>dentalcrm.contacts_users.date_modified</code>.
	 */
	public final TableField<ContactsUsersRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>dentalcrm.contacts_users.deleted</code>.
	 */
	public final TableField<ContactsUsersRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaulted(true), this, "");

	/**
	 * Create a <code>dentalcrm.contacts_users</code> table reference
	 */
	public ContactsUsers() {
		this("contacts_users", null);
	}

	/**
	 * Create an aliased <code>dentalcrm.contacts_users</code> table reference
	 */
	public ContactsUsers(String alias) {
		this(alias, CONTACTS_USERS);
	}

	private ContactsUsers(String alias, Table<ContactsUsersRecord> aliased) {
		this(alias, aliased, null);
	}

	private ContactsUsers(String alias, Table<ContactsUsersRecord> aliased, Field<?>[] parameters) {
		super(alias, Dentalcrm.DENTALCRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ContactsUsersRecord> getPrimaryKey() {
		return Keys.KEY_CONTACTS_USERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ContactsUsersRecord>> getKeys() {
		return Arrays.<UniqueKey<ContactsUsersRecord>>asList(Keys.KEY_CONTACTS_USERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsUsers as(String alias) {
		return new ContactsUsers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ContactsUsers rename(String name) {
		return new ContactsUsers(name, null);
	}
}
