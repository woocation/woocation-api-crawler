package com.woocation.model;

import java.util.List;

/**
 * The Class WeatherTypeParam.
 */
public class WeatherTypeParam {
	
	/** The unit. */
	private String unit;
	
	/** The value. */
	private List<Float> value;

	/**
	 * Gets the unit.
	 *
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Sets the unit.
	 *
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public List<Float> getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the value to set
	 */
	public void setValue(List<Float> value) {
		this.value = value;
	}
}
