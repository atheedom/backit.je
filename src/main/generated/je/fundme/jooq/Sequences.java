/**
 * This class is generated by jOOQ
 */
package je.fundme.jooq;

/**
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.app_user_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> APP_USER_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("app_user_id_seq", je.fundme.jooq.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
