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
	private List<Holiday> holidays;

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
	 * Gets the holidays.
	 *
	 * @return the holidays
	 */
	public List<Holiday> getHolidays() {
		return holidays;
	}

	/**
	 * Sets the holidays.
	 *
	 * @param holidays the holidays to set
	 */
	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

}
