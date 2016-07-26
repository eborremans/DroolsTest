/**
 * This class is generated by jOOQ
 */
package com.billinghouse.jooq.dentalcrm.tables.pojos;


import com.billinghouse.jooq.dentalcrm.tables.interfaces.IContactsCases;

import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class ContactsCases implements IContactsCases {

	private static final long serialVersionUID = -1465445067;

	private String    id;
	private String    contactId;
	private String    caseId;
	private String    contactRole;
	private Timestamp dateModified;
	private Byte      deleted;

	public ContactsCases() {}

	public ContactsCases(ContactsCases value) {
		this.id = value.id;
		this.contactId = value.contactId;
		this.caseId = value.caseId;
		this.contactRole = value.contactRole;
		this.dateModified = value.dateModified;
		this.deleted = value.deleted;
	}

	public ContactsCases(
		String    id,
		String    contactId,
		String    caseId,
		String    contactRole,
		Timestamp dateModified,
		Byte      deleted
	) {
		this.id = id;
		this.contactId = contactId;
		this.caseId = caseId;
		this.contactRole = contactRole;
		this.dateModified = dateModified;
		this.deleted = deleted;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getContactId() {
		return this.contactId;
	}

	@Override
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	@Override
	public String getCaseId() {
		return this.caseId;
	}

	@Override
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	@Override
	public String getContactRole() {
		return this.contactRole;
	}

	@Override
	public void setContactRole(String contactRole) {
		this.contactRole = contactRole;
	}

	@Override
	public Timestamp getDateModified() {
		return this.dateModified;
	}

	@Override
	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}

	@Override
	public Byte getDeleted() {
		return this.deleted;
	}

	@Override
	public void setDeleted(Byte deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ContactsCases (");

		sb.append(id);
		sb.append(", ").append(contactId);
		sb.append(", ").append(caseId);
		sb.append(", ").append(contactRole);
		sb.append(", ").append(dateModified);
		sb.append(", ").append(deleted);

		sb.append(")");
		return sb.toString();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IContactsCases from) {
		setId(from.getId());
		setContactId(from.getContactId());
		setCaseId(from.getCaseId());
		setContactRole(from.getContactRole());
		setDateModified(from.getDateModified());
		setDeleted(from.getDeleted());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IContactsCases> E into(E into) {
		into.from(this);
		return into;
	}
}
