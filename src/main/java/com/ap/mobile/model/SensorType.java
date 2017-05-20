/**
 * AgingSafeSenior
 */
package com.ap.mobile.model;

/**
 * @author jungwhan
 * SensorType.java
 * 2:20:51 AM Feb 17, 2016 2016
 */
public enum SensorType {
	MOTION_SENSOR(1, "MOTION_SENSOR"),
	
	TEMPERATURE_SENSOR(1, "TEMPERATURE_SENSOR"),
	
	DOOR_SENSOR(1, "DOOR_SENSOR");
	
	private int sensorId;
	
	private String sensorType;
	
	private SensorType(int sensorId, String sensorType) {
		this.sensorId = sensorId;
		this.sensorType = sensorType;
	}

	/**
	 * @return the sensorId
	 */
	public int getSensorId() {
		return sensorId;
	}

	/**
	 * @param sensorId the sensorId to set
	 */
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}

	/**
	 * @return the sensorType
	 */
	public String getSensorType() {
		return sensorType;
	}

	/**
	 * @param sensorType the sensorType to set
	 */
	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}
}
