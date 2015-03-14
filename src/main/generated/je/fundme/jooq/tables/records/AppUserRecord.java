/**
 * This class is generated by jOOQ
 */
package je.fundme.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppUserRecord extends org.jooq.impl.UpdatableRecordImpl<je.fundme.jooq.tables.records.AppUserRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.String, byte[], byte[], java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1310772011;

	/**
	 * Setter for <code>public.app_user.id</code>.
	 */
	public AppUserRecord setId(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.app_user.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.app_user.username</code>.
	 */
	public AppUserRecord setUsername(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.app_user.username</code>.
	 */
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.app_user.password</code>.
	 */
	public AppUserRecord setPassword(byte[] value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.app_user.password</code>.
	 */
	public byte[] getPassword() {
		return (byte[]) getValue(2);
	}

	/**
	 * Setter for <code>public.app_user.salt</code>.
	 */
	public AppUserRecord setSalt(byte[] value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.app_user.salt</code>.
	 */
	public byte[] getSalt() {
		return (byte[]) getValue(3);
	}

	/**
	 * Setter for <code>public.app_user.first_name</code>.
	 */
	public AppUserRecord setFirstName(java.lang.String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.app_user.first_name</code>.
	 */
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.app_user.last_name</code>.
	 */
	public AppUserRecord setLastName(java.lang.String value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.app_user.last_name</code>.
	 */
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.app_user.email</code>.
	 */
	public AppUserRecord setEmail(java.lang.String value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.app_user.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String, byte[], byte[], java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String, byte[], byte[], java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return je.fundme.jooq.tables.AppUser.APP_USER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return je.fundme.jooq.tables.AppUser.APP_USER.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field3() {
		return je.fundme.jooq.tables.AppUser.APP_USER.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field4() {
		return je.fundme.jooq.tables.AppUser.APP_USER.SALT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return je.fundme.jooq.tables.AppUser.APP_USER.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return je.fundme.jooq.tables.AppUser.APP_USER.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return je.fundme.jooq.tables.AppUser.APP_USER.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value3() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value4() {
		return getSalt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserRecord value2(java.lang.String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserRecord value3(byte[] value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserRecord value4(byte[] value) {
		setSalt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserRecord value5(java.lang.String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserRecord value6(java.lang.String value) {
		setLastName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserRecord value7(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserRecord values(java.lang.Integer value1, java.lang.String value2, byte[] value3, byte[] value4, java.lang.String value5, java.lang.String value6, java.lang.String value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AppUserRecord
	 */
	public AppUserRecord() {
		super(je.fundme.jooq.tables.AppUser.APP_USER);
	}

	/**
	 * Create a detached, initialised AppUserRecord
	 */
	public AppUserRecord(java.lang.Integer id, java.lang.String username, byte[] password, byte[] salt, java.lang.String firstName, java.lang.String lastName, java.lang.String email) {
		super(je.fundme.jooq.tables.AppUser.APP_USER);

		setValue(0, id);
		setValue(1, username);
		setValue(2, password);
		setValue(3, salt);
		setValue(4, firstName);
		setValue(5, lastName);
		setValue(6, email);
	}
}
