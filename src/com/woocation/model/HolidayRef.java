/**
 * 
 */
package com.woocation.model;

import java.util.List;

/**
 * The Class HolidayRef.
 *
 * @author ankit.gupta
 */
public class HolidayRef {

	/** The geonameid. */
	private String geonameid;

	/** The holidays. */

	private List<Holiday> holidayList = null;

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
	 * @param geonameid
	 *            the geonameid to set
	 */
	public void setGeonameid(String geonameid) {
		this.geonameid = geonameid;
	}

	/**
	 * @return the holidayList
	 */
	public List<Holiday> getHolidayList() {
		return holidayList;
	}

	/**
	 * @param holidayList
	 *            the holidayList to set
	 */
	public void setHolidayList(List<Holiday> holidayList) {
		this.holidayList = holidayList;
	}
}
