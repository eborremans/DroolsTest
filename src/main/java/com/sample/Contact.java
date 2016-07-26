package com.sample;

import java.sql.Date;
import java.sql.Timestamp;

import com.billinghouse.jooq.dentalcrm.tables.interfaces.IContacts;

public class Contact implements IContacts {

	private String crmId;
	private Timestamp dateEntered;
	private Timestamp dateModified;
	private String modifiedUserId;
	private String createdBy;
	private String description;
	private Byte deleted;
	private String assignedUserId;
	private String salutation;
	private String firstName;
	private String lastName;
	private String title;
	private String primaryAddressStreet;
	private String primaryAddressCity;
	private String primaryAddressState;
	private String primaryAddressPostalCode;
	private String primaryAddressCountry;
	private Date birthDate;

	@Override
	public void setId(String value) {
		this.crmId = value;
		
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return crmId;
	}

	@Override
	public void setDateEntered(Timestamp value) {
		this.dateEntered = value;		
	}

	@Override
	public Timestamp getDateEntered() {
		return dateEntered;
	}

	@Override
	public void setDateModified(Timestamp value) {
		this.dateModified = value;		
	}

	@Override
	public Timestamp getDateModified() {
		return dateModified;
	}

	@Override
	public void setModifiedUserId(String value) {
		this.modifiedUserId = value;
	}

	@Override
	public String getModifiedUserId() {
		return modifiedUserId;
	}

	@Override
	public void setCreatedBy(String value) {
		this.createdBy = value;		
	}

	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setDescription(String value) {
		this.description = value;		
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDeleted(Byte value) {
		this.deleted = value;		
	}

	@Override
	public Byte getDeleted() {
		// TODO Auto-generated method stub
		return deleted;
	}

	@Override
	public void setAssignedUserId(String value) {
		this.assignedUserId = value;		
	}

	@Override
	public String getAssignedUserId() {
		// TODO Auto-generated method stub
		return assignedUserId;
	}

	@Override
	public void setSalutation(String value) {
		this.salutation = value;		
	}

	@Override
	public String getSalutation() {
		return salutation;
	}

	@Override
	public void setFirstName(String value) {
		this.firstName = value;		
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setLastName(String value) {
		this.lastName = value;		
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setTitle(String value) {
		this.title = value;		
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setPhoto(String value) {
		
	}

	@Override
	public String getPhoto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDepartment(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDoNotCall(Byte value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Byte getDoNotCall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhoneHome(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPhoneHome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhoneMobile(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPhoneMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhoneWork(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPhoneWork() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhoneOther(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPhoneOther() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPhoneFax(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPhoneFax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPrimaryAddressStreet(String value) {
		this.primaryAddressStreet = value;		
	}

	@Override
	public String getPrimaryAddressStreet() {
		return primaryAddressStreet;
	}

	@Override
	public void setPrimaryAddressCity(String value) {
		this.primaryAddressCity = value;		
	}

	@Override
	public String getPrimaryAddressCity() {
		return primaryAddressCity;
	}

	@Override
	public void setPrimaryAddressState(String value) {
		this.primaryAddressState = value;		
	}

	@Override
	public String getPrimaryAddressState() {
		return primaryAddressState;
	}

	@Override
	public void setPrimaryAddressPostalcode(String value) {
		this.primaryAddressPostalCode = value;		
	}

	@Override
	public String getPrimaryAddressPostalcode() {
		return primaryAddressPostalCode;
	}

	@Override
	public void setPrimaryAddressCountry(String value) {
		this.primaryAddressCountry = value;		
	}

	@Override
	public String getPrimaryAddressCountry() {
		// TODO Auto-generated method stub
		return primaryAddressCountry;
	}

	@Override
	public void setAltAddressStreet(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAltAddressStreet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAltAddressCity(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAltAddressCity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAltAddressState(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAltAddressState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAltAddressPostalcode(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAltAddressPostalcode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAltAddressCountry(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAltAddressCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAssistant(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAssistant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAssistantPhone(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAssistantPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLeadSource(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLeadSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReportsToId(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getReportsToId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBirthdate(Date value) {
		this.birthDate = value;		
	}

	@Override
	public Date getBirthdate() {
		return birthDate;
	}

	@Override
	public void setCampaignId(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCampaignId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJoomlaAccountId(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getJoomlaAccountId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPortalAccountDisabled(Byte value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Byte getPortalAccountDisabled() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPortalUserType(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPortalUserType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void from(IContacts from) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E extends IContacts> E into(E into) {
		// TODO Auto-generated method stub
		return null;
	}

}
