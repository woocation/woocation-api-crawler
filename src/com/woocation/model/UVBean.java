package com.woocation.model;

import java.util.Map;

/**
 * The Class UVBean.
 */
public class UVBean {
	
	/** The geonameid. */
	private String geonameid;
	
	/** The uvindex. */
	private Map<String, ModeRange> uvindex;

	/**
	 * Instantiates a new UV bean.
	 */
	public UVBean() {
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
	 * Gets the uvindex.
	 *
	 * @return the uvindex
	 */
	public Map<String, ModeRange> getUvindex() {
		return uvindex;
	}

	/**
	 * Sets the uvindex.
	 *
	 * @param uvindex the uvindex to set
	 */
	public void setUvindex(Map<String, ModeRange> uvindex) {
		this.uvindex = uvindex;
	}
}
