/**
 * AgingPlaceCommon
 */
package com.ap.common.models.http;

/**
 *  Copyright (C) Projecteria LLC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jungwhan Kim Projecteria LLC, 2016 April 19
 */

/**
 * @author jungwhan
 * HttpBatteryNotification.java
 * 2:50:33 PM Apr 22, 2016 2016
 */
public class HttpBatteryNotification extends HttpNotification {

	private static final long serialVersionUID = 8662618018261459119L;

	private String sensorName;
	
	private String sensorType;
	
	private String batteryLevel;
	
	private String extraInfo;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append(super.toString()).append(", ");
		b.append("sensorName=").append(sensorName).append(", ");
		b.append("sensorType=").append(sensorType).append(", ");
		b.append("batteryLevel=").append(batteryLevel).append(", ");
		b.append("extraInfo=").append(extraInfo).append(", ");
		return b.toString();
	}

	/**
	 * @return the sensorName
	 */
	public String getSensorName() {
		return sensorName;
	}

	/**
	 * @param sensorName the sensorName to set
	 */
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
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

	/**
	 * @return the batteryLevel
	 */
	public String getBatteryLevel() {
		return batteryLevel;
	}

	/**
	 * @param batteryLevel the batteryLevel to set
	 */
	public void setBatteryLevel(String batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	/**
	 * @return the extraInfo
	 */
	public String getExtraInfo() {
		return extraInfo;
	}

	/**
	 * @param extraInfo the extraInfo to set
	 */
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}
}
