/**
 * This class is generated by jOOQ
 */
package com.billinghouse.jooq.dentalcrm.tables;


import com.billinghouse.jooq.dentalcrm.Dentalcrm;
import com.billinghouse.jooq.dentalcrm.Keys;
import com.billinghouse.jooq.dentalcrm.tables.records.ContactsCstmRecord;

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
public class ContactsCstm extends TableImpl<ContactsCstmRecord> {

	private static final long serialVersionUID = 1002920500;

	/**
	 * The reference instance of <code>dentalcrm.contacts_cstm</code>
	 */
	public static final ContactsCstm CONTACTS_CSTM = new ContactsCstm();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ContactsCstmRecord> getRecordType() {
		return ContactsCstmRecord.class;
	}

	/**
	 * The column <code>dentalcrm.contacts_cstm.id_c</code>.
	 */
	public final TableField<ContactsCstmRecord, String> ID_C = createField("id_c", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>dentalcrm.contacts_cstm.jjwg_maps_lng_c</code>.
	 */
	public final TableField<ContactsCstmRecord, Double> JJWG_MAPS_LNG_C = createField("jjwg_maps_lng_c", org.jooq.impl.SQLDataType.FLOAT.defaulted(true), this, "");

	/**
	 * The column <code>dentalcrm.contacts_cstm.jjwg_maps_lat_c</code>.
	 */
	public final TableField<ContactsCstmRecord, Double> JJWG_MAPS_LAT_C = createField("jjwg_maps_lat_c", org.jooq.impl.SQLDataType.FLOAT.defaulted(true), this, "");

	/**
	 * The column <code>dentalcrm.contacts_cstm.jjwg_maps_geocode_status_c</code>.
	 */
	public final TableField<ContactsCstmRecord, String> JJWG_MAPS_GEOCODE_STATUS_C = createField("jjwg_maps_geocode_status_c", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dentalcrm.contacts_cstm.jjwg_maps_address_c</code>.
	 */
	public final TableField<ContactsCstmRecord, String> JJWG_MAPS_ADDRESS_C = createField("jjwg_maps_address_c", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>dentalcrm.contacts_cstm</code> table reference
	 */
	public ContactsCstm() {
		this("contacts_cstm", null);
	}

	/**
	 * Create an aliased <code>dentalcrm.contacts_cstm</code> table reference
	 */
	public ContactsCstm(String alias) {
		this(alias, CONTACTS_CSTM);
	}

	private ContactsCstm(String alias, Table<ContactsCstmRecord> aliased) {
		this(alias, aliased, null);
	}

	private ContactsCstm(String alias, Table<ContactsCstmRecord> aliased, Field<?>[] parameters) {
		super(alias, Dentalcrm.DENTALCRM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ContactsCstmRecord> getPrimaryKey() {
		return Keys.KEY_CONTACTS_CSTM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ContactsCstmRecord>> getKeys() {
		return Arrays.<UniqueKey<ContactsCstmRecord>>asList(Keys.KEY_CONTACTS_CSTM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContactsCstm as(String alias) {
		return new ContactsCstm(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ContactsCstm rename(String name) {
		return new ContactsCstm(name, null);
	}
}
