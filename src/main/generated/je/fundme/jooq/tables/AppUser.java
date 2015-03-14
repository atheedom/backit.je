/**
 * This class is generated by jOOQ
 */
package je.fundme.jooq.tables;

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
public class AppUser extends org.jooq.impl.TableImpl<je.fundme.jooq.tables.records.AppUserRecord> {

	private static final long serialVersionUID = 804573654;

	/**
	 * The reference instance of <code>public.app_user</code>
	 */
	public static final je.fundme.jooq.tables.AppUser APP_USER = new je.fundme.jooq.tables.AppUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<je.fundme.jooq.tables.records.AppUserRecord> getRecordType() {
		return je.fundme.jooq.tables.records.AppUserRecord.class;
	}

	/**
	 * The column <code>public.app_user.id</code>.
	 */
	public final org.jooq.TableField<je.fundme.jooq.tables.records.AppUserRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.app_user.username</code>.
	 */
	public final org.jooq.TableField<je.fundme.jooq.tables.records.AppUserRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.app_user.password</code>.
	 */
	public final org.jooq.TableField<je.fundme.jooq.tables.records.AppUserRecord, byte[]> PASSWORD = createField("password", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

	/**
	 * The column <code>public.app_user.salt</code>.
	 */
	public final org.jooq.TableField<je.fundme.jooq.tables.records.AppUserRecord, byte[]> SALT = createField("salt", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

	/**
	 * The column <code>public.app_user.first_name</code>.
	 */
	public final org.jooq.TableField<je.fundme.jooq.tables.records.AppUserRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.app_user.last_name</code>.
	 */
	public final org.jooq.TableField<je.fundme.jooq.tables.records.AppUserRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.app_user.email</code>.
	 */
	public final org.jooq.TableField<je.fundme.jooq.tables.records.AppUserRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.app_user</code> table reference
	 */
	public AppUser() {
		this("app_user", null);
	}

	/**
	 * Create an aliased <code>public.app_user</code> table reference
	 */
	public AppUser(java.lang.String alias) {
		this(alias, je.fundme.jooq.tables.AppUser.APP_USER);
	}

	private AppUser(java.lang.String alias, org.jooq.Table<je.fundme.jooq.tables.records.AppUserRecord> aliased) {
		this(alias, aliased, null);
	}

	private AppUser(java.lang.String alias, org.jooq.Table<je.fundme.jooq.tables.records.AppUserRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, je.fundme.jooq.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<je.fundme.jooq.tables.records.AppUserRecord, java.lang.Integer> getIdentity() {
		return je.fundme.jooq.Keys.IDENTITY_APP_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<je.fundme.jooq.tables.records.AppUserRecord> getPrimaryKey() {
		return je.fundme.jooq.Keys.APP_USER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<je.fundme.jooq.tables.records.AppUserRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<je.fundme.jooq.tables.records.AppUserRecord>>asList(je.fundme.jooq.Keys.APP_USER_PKEY, je.fundme.jooq.Keys.APP_USER_USERNAME_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public je.fundme.jooq.tables.AppUser as(java.lang.String alias) {
		return new je.fundme.jooq.tables.AppUser(alias, this);
	}

	/**
	 * Rename this table
	 */
	public je.fundme.jooq.tables.AppUser rename(java.lang.String name) {
		return new je.fundme.jooq.tables.AppUser(name, null);
	}
}