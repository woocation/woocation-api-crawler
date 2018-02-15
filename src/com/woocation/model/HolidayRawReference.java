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
public class HolidayRawReference {
	
	/** The geonameid. */
	private String geonameid;
	
	/** The holidays. */
	private List<HolidayRaw> holidays;
	
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
	public List<HolidayRaw> getHolidays() {
		return holidays;
	}

	/**
	 * Sets the holidays.
	 *
	 * @param holidays the holidays to set
	 */
	public void setHolidays(List<HolidayRaw> holidays) {
		this.holidays = holidays;
	}

}
