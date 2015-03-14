/**
 * This class is generated by jOOQ
 */
package je.backit.jooq.tables.records;

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
public class CampaignViewRecord extends org.jooq.impl.TableRecordImpl<je.backit.jooq.tables.records.CampaignViewRecord> implements org.jooq.Record2<java.lang.Integer, java.sql.Timestamp> {

	private static final long serialVersionUID = 673346468;

	/**
	 * Setter for <code>public.campaign_view.campaign_id</code>.
	 */
	public CampaignViewRecord setCampaignId(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.campaign_view.campaign_id</code>.
	 */
	public java.lang.Integer getCampaignId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.campaign_view.view_date</code>.
	 */
	public CampaignViewRecord setViewDate(java.sql.Timestamp value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.campaign_view.view_date</code>.
	 */
	public java.sql.Timestamp getViewDate() {
		return (java.sql.Timestamp) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return je.backit.jooq.tables.CampaignView.CAMPAIGN_VIEW.CAMPAIGN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return je.backit.jooq.tables.CampaignView.CAMPAIGN_VIEW.VIEW_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getCampaignId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getViewDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CampaignViewRecord value1(java.lang.Integer value) {
		setCampaignId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CampaignViewRecord value2(java.sql.Timestamp value) {
		setViewDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CampaignViewRecord values(java.lang.Integer value1, java.sql.Timestamp value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CampaignViewRecord
	 */
	public CampaignViewRecord() {
		super(je.backit.jooq.tables.CampaignView.CAMPAIGN_VIEW);
	}

	/**
	 * Create a detached, initialised CampaignViewRecord
	 */
	public CampaignViewRecord(java.lang.Integer campaignId, java.sql.Timestamp viewDate) {
		super(je.backit.jooq.tables.CampaignView.CAMPAIGN_VIEW);

		setValue(0, campaignId);
		setValue(1, viewDate);
	}
}