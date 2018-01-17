package com.woocation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class UVMonth.
 */
public class ModeRange {

	/** The max. */
	@JsonProperty
	private Float max;

	/** The median. */
	@JsonProperty
	private Float median;

	/** The min. */
	@JsonProperty
	private Float min;

	/**
	 * Instantiates a new UV month.
	 */
	public ModeRange() {
	}

	public ModeRange(Float max, Float median, Float min) {
		this.max = max;
		this.median = median;
		this.min = min;
	}

	/**
	 * @return the max
	 */
	public Float getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(Float max) {
		this.max = max;
	}

	/**
	 * @return the median
	 */
	public Float getMedian() {
		return median;
	}

	/**
	 * @param median the median to set
	 */
	public void setMedian(Float median) {
		this.median = median;
	}

	/**
	 * @return the min
	 */
	public Float getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(Float min) {
		this.min = min;
	}
}
