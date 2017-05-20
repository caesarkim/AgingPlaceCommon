/**
 * AgingPlaceMobile
 */
package com.ap.mobile.model;

import com.ap.common.models.http.HttpSensorDevice;

/**
 * @author jungwhan
 * UISensorDevice.java
 * 12:42:13 AM Feb 14, 2016 2016
 */
public class UISensorDevice extends HttpSensorDevice {
	private boolean isConnected = false;
	
	private boolean isReset = false;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer(super.toString());
		b.append("isConnected=").append(isConnected).append(", ");
		return b.toString();
	}
	
	@Override
	public int hashCode() {
		return this.getMacAddress().hashCode() + this.getSensorName().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof UISensorDevice)) {
			return false;
		}
		UISensorDevice sensorDevice = (UISensorDevice)obj;
		return (sensorDevice.getMacAddress().equals(getMacAddress()) && sensorDevice.getSensorName().equalsIgnoreCase(getSensorName()));
		
	}

	/**
	 * @return the isConnected
	 */
	public boolean isConnected() {
		return isConnected;
	}

	/**
	 * @param isConnected the isConnected to set
	 */
	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}

	/**
	 * @return the isReset
	 */
	public boolean isReset() {
		return isReset;
	}

	/**
	 * @param isReset the isReset to set
	 */
	public void setReset(boolean isReset) {
		this.isReset = isReset;
	}
}
