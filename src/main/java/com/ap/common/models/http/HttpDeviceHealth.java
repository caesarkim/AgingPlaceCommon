/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jungwhan
 * HttpDeviceHealth.java
 * 11:46:10 PM Mar 12, 2016 2016
 */
public class HttpDeviceHealth implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -68303127242689614L;

	private String uuid;
	
	private String pinNumber;
	
	private Map<String, Boolean> deviceHealths = new HashMap<String, Boolean>();
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("uuid=").append(uuid).append(", ");
		b.append("pinNumber=").append(pinNumber).append(", ");
		b.append("deviceHealths=").append(deviceHealths).append(", ");
		return b.toString();
	}
	
	public void addDeviceHealth(String macAddress, Boolean status) {
		deviceHealths.put(macAddress, status);
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the deviceHealths
	 */
	public Map<String, Boolean> getDeviceHealths() {
		return deviceHealths;
	}

	/**
	 * @param deviceHealths the deviceHealths to set
	 */
	public void setDeviceHealths(Map<String, Boolean> deviceHealths) {
		this.deviceHealths = deviceHealths;
	}

	/**
	 * @return the pinNumber
	 */
	public String getPinNumber() {
		return pinNumber;
	}

	/**
	 * @param pinNumber the pinNumber to set
	 */
	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	
}
