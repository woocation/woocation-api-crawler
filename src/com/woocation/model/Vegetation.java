package com.woocation.model;

/**
 * The Class UVBean.
 */
public class Vegetation {
	
	/** The geonameid. */
	private String geonameid;
	
	/** The uvindex. */
	private ModeRange evi;

	/**
	 * Instantiates a new UV bean.
	 */
	public Vegetation() {
	}

	/**
	 * Gets the geonameid.
	 *
	 * @return the geonameid
	 */
	public String getGeonameid() {
		return geonameid;
	}

	/**
	 * Sets the geonameid.
	 *
	 * @param geonameid the geonameid to set
	 */
	public void setGeonameid(String geonameid) {
		this.geonameid = geonameid;
	}

	/**
	 * @return the evi
	 */
	public ModeRange getEvi() {
		return evi;
	}

	/**
	 * @param evi the evi to set
	 */
	public void setEvi(ModeRange evi) {
		this.evi = evi;
	}
}
