/**
 * This class is generated by jOOQ
 */
package com.billinghouse.jooq.dentalcrm.tables.records;


import com.billinghouse.jooq.dentalcrm.tables.ContactsBugs;
import com.billinghouse.jooq.dentalcrm.tables.interfaces.IContactsBugs;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ContactsBugsRecord extends UpdatableRecordImpl<ContactsBugsRecord> implements Record6<String, String, String, String, Timestamp, Byte>, IContactsBugs {

	private static final long serialVersionUID = 633890654;

	/**
	 * Setter for <code>dentalcrm.contacts_bugs.id</code>.
	 */
	@Override
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_bugs.id</code>.
	 */
	@Override
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_bugs.contact_id</code>.
	 */
	@Override
	public void setContactId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_bugs.contact_id</code>.
	 */
	@Override
	public String getContactId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_bugs.bug_id</code>.
	 */
	@Override
	public void setBugId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_bugs.bug_id</code>.
	 */
	@Override
	public String getBugId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_bugs.contact_role</code>.
	 */
	@Override
	public void setContactRole(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_bugs.contact_role</code>.
	 */
	@Override
	public String getContactRole() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_bugs.date_modified</code>.
	 */
	@Override
	public void setDateModified(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_bugs.date_modified</code>.
	 */
	@Override
	public Timestamp getDateModified() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_bugs.deleted</code>.
	 */
	@Override
	public void setDeleted(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_bugs.deleted</code>.
	 */
	@Override
	public Byte getDeleted() {
		return (Byte) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, Timestamp, Byte> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, Timestamp, Byte> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ContactsBugs.CONTACTS_BUGS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return ContactsBugs.CONTACTS_BUGS.CONTACT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ContactsBugs.CONTACTS_BUGS.BUG_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ContactsBugs.CONTACTS_BUGS.CONTACT_ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return ContactsBugs.CONTACTS_BUGS.DATE_MODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return ContactsBugs.CONTACTS_BUGS.DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getContactId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBugId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getContactRole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getDateModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsBugsRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsBugsRecord value2(String value) {
		setContactId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsBugsRecord value3(String value) {
		setBugId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsBugsRecord value4(String value) {
		setContactRole(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsBugsRecord value5(Timestamp value) {
		setDateModified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsBugsRecord value6(Byte value) {
		setDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsBugsRecord values(String value1, String value2, String value3, String value4, Timestamp value5, Byte value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IContactsBugs from) {
		setId(from.getId());
		setContactId(from.getContactId());
		setBugId(from.getBugId());
		setContactRole(from.getContactRole());
		setDateModified(from.getDateModified());
		setDeleted(from.getDeleted());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IContactsBugs> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ContactsBugsRecord
	 */
	public ContactsBugsRecord() {
		super(ContactsBugs.CONTACTS_BUGS);
	}

	/**
	 * Create a detached, initialised ContactsBugsRecord
	 */
	public ContactsBugsRecord(String id, String contactId, String bugId, String contactRole, Timestamp dateModified, Byte deleted) {
		super(ContactsBugs.CONTACTS_BUGS);

		setValue(0, id);
		setValue(1, contactId);
		setValue(2, bugId);
		setValue(3, contactRole);
		setValue(4, dateModified);
		setValue(5, deleted);
	}
}
