/*
 * 
 */
package com.woocation.model;

import java.util.List;

public class AirportDetails {

	/** The geonameid. */
	private Long geonameid;

	/** The airports. */
	private List<Airport> airports;

	public AirportDetails() {
	}

	/**
	 * @return the geonameid
	 */
	public Long getGeonameid() {
		return geonameid;
	}

	/**
	 * @param geonameid
	 *            the geonameid to set
	 */
	public void setGeonameid(Long geonameid) {
		this.geonameid = geonameid;
	}

	/**
	 * @return the airports
	 */
	public List<Airport> getAirports() {
		return airports;
	}

	/**
	 * @param airports
	 *            the airports to set
	 */
	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}
}
