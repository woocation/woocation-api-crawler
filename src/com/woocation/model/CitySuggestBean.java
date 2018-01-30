/**
 * 
 */
package com.woocation.model;

import java.math.BigInteger;

/**
 * The Class CitySuggestBean.
 *
 * @author ankit
 */
public class CitySuggestBean {

	/** The input. */
	private String input;
	
	/** The weight. */
	private BigInteger weight;
	
	
	/**
	 * Instantiates a new city suggest bean.
	 *
	 * @param input the input
	 * @param weight the weight
	 */
	public CitySuggestBean() {
	}
	
	/**
	 * Instantiates a new city suggest bean.
	 *
	 * @param input the input
	 * @param weight the weight
	 */
	public CitySuggestBean(String input, BigInteger weight) {
		this.input = input;
		this.weight = weight;
	}
	
	/**
	 * Gets the input.
	 *
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * Sets the input.
	 *
	 * @param input the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * Gets the weight.
	 *
	 * @return the weight
	 */
	public BigInteger getWeight() {
		return weight;
	}

	/**
	 * Sets the weight.
	 *
	 * @param weight the weight to set
	 */
	public void setWeight(BigInteger weight) {
		this.weight = weight;
	}

}
