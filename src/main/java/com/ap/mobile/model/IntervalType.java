/**
 * AgingPlaceCommon
 */
package com.ap.mobile.model;

/**
 * @author jungwhan
 * IntervalType.java
 * 10:47:21 PM Apr 13, 2016 2016
 */
public enum IntervalType {
	MINUTES_20 (1, "20 MINUTES"),
	
	MINUTES_30 (2, "30 MINUTES"),
	
	MINUTES_40 (3, "40 MINUTES"),
	
	HOUR_1 (4, "1 HOUR"),
	
	HOUR_2 (5, "2 HOURS");
	
	private int intervalType;
	
	private String label;

	private IntervalType(int intervalType, String label) {
		this.intervalType = intervalType;
		this.label = label;
	}
	
	public static int getDefaultIntervalType() {
		return MINUTES_30.intervalType;
	}

	/**
	 * @return the intervalType
	 */
	public int getIntervalType() {
		return intervalType;
	}

	/**
	 * @param intervalType the intervalType to set
	 */
	public void setIntervalType(int intervalType) {
		this.intervalType = intervalType;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	

}
