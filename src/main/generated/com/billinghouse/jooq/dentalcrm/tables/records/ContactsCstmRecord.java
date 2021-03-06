/**
 * This class is generated by jOOQ
 */
package com.billinghouse.jooq.dentalcrm.tables.records;


import com.billinghouse.jooq.dentalcrm.tables.ContactsCstm;
import com.billinghouse.jooq.dentalcrm.tables.interfaces.IContactsCstm;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class ContactsCstmRecord extends UpdatableRecordImpl<ContactsCstmRecord> implements Record5<String, Double, Double, String, String>, IContactsCstm {

	private static final long serialVersionUID = -600720934;

	/**
	 * Setter for <code>dentalcrm.contacts_cstm.id_c</code>.
	 */
	@Override
	public void setIdC(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_cstm.id_c</code>.
	 */
	@Override
	public String getIdC() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_cstm.jjwg_maps_lng_c</code>.
	 */
	@Override
	public void setJjwgMapsLngC(Double value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_cstm.jjwg_maps_lng_c</code>.
	 */
	@Override
	public Double getJjwgMapsLngC() {
		return (Double) getValue(1);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_cstm.jjwg_maps_lat_c</code>.
	 */
	@Override
	public void setJjwgMapsLatC(Double value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_cstm.jjwg_maps_lat_c</code>.
	 */
	@Override
	public Double getJjwgMapsLatC() {
		return (Double) getValue(2);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_cstm.jjwg_maps_geocode_status_c</code>.
	 */
	@Override
	public void setJjwgMapsGeocodeStatusC(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_cstm.jjwg_maps_geocode_status_c</code>.
	 */
	@Override
	public String getJjwgMapsGeocodeStatusC() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>dentalcrm.contacts_cstm.jjwg_maps_address_c</code>.
	 */
	@Override
	public void setJjwgMapsAddressC(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dentalcrm.contacts_cstm.jjwg_maps_address_c</code>.
	 */
	@Override
	public String getJjwgMapsAddressC() {
		return (String) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, Double, Double, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, Double, Double, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ContactsCstm.CONTACTS_CSTM.ID_C;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Double> field2() {
		return ContactsCstm.CONTACTS_CSTM.JJWG_MAPS_LNG_C;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Double> field3() {
		return ContactsCstm.CONTACTS_CSTM.JJWG_MAPS_LAT_C;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ContactsCstm.CONTACTS_CSTM.JJWG_MAPS_GEOCODE_STATUS_C;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ContactsCstm.CONTACTS_CSTM.JJWG_MAPS_ADDRESS_C;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getIdC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Double value2() {
		return getJjwgMapsLngC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Double value3() {
		return getJjwgMapsLatC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getJjwgMapsGeocodeStatusC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getJjwgMapsAddressC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsCstmRecord value1(String value) {
		setIdC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsCstmRecord value2(Double value) {
		setJjwgMapsLngC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsCstmRecord value3(Double value) {
		setJjwgMapsLatC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsCstmRecord value4(String value) {
		setJjwgMapsGeocodeStatusC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsCstmRecord value5(String value) {
		setJjwgMapsAddressC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsCstmRecord values(String value1, Double value2, Double value3, String value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IContactsCstm from) {
		setIdC(from.getIdC());
		setJjwgMapsLngC(from.getJjwgMapsLngC());
		setJjwgMapsLatC(from.getJjwgMapsLatC());
		setJjwgMapsGeocodeStatusC(from.getJjwgMapsGeocodeStatusC());
		setJjwgMapsAddressC(from.getJjwgMapsAddressC());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IContactsCstm> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ContactsCstmRecord
	 */
	public ContactsCstmRecord() {
		super(ContactsCstm.CONTACTS_CSTM);
	}

	/**
	 * Create a detached, initialised ContactsCstmRecord
	 */
	public ContactsCstmRecord(String idC, Double jjwgMapsLngC, Double jjwgMapsLatC, String jjwgMapsGeocodeStatusC, String jjwgMapsAddressC) {
		super(ContactsCstm.CONTACTS_CSTM);

		setValue(0, idC);
		setValue(1, jjwgMapsLngC);
		setValue(2, jjwgMapsLatC);
		setValue(3, jjwgMapsGeocodeStatusC);
		setValue(4, jjwgMapsAddressC);
	}
}
