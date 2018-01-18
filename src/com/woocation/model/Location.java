package com.woocation.model;

/**
 * The Class Location.
 */
public final class Location {

	/** The lat. */
	private Double lat;
    
    /** The lon. */
    private Double lon;
    
    /**
     * Instantiates a new location.
     */
    public Location(){
    	
    }
	/**
	 * Instantiates a new location.
	 *
	 * @param lat the lat
	 * @param lon the lon
	 */
	public Location(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

	/**
	 * Gets the lat.
	 *
	 * @return the lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * Gets the lon.
	 *
	 * @return the lon
	 */
	public Double getLon() {
		return lon;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(Double lon) {
		this.lon = lon;
	}
}
