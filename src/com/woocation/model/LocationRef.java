package com.woocation.model;

import java.util.List;

/**
 * The Class LocationRef.
 */
public class LocationRef {

	/** The type. */
	private String type;

	/** The coordinates. */
	private List<Double> coordinates = null;

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *            the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the coordinates.
	 *
	 * @return the coordinates
	 */
	public List<Double> getCoordinates() {
		return coordinates;
	}

	/**
	 * Sets the coordinates.
	 *
	 * @param coordinates
	 *            the new coordinates
	 */
	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}
}
