/**
 * AgingPlace
 */
package com.ap.common.models.http;

import com.ap.mobile.model.UISensorDevice;

/**
 * @author jungwhan
 * Sensor.java
 * 12:35:05 AM Feb 3, 2016 2016
 */
public class HttpSensorDevice implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3344899816020871631L;

	private long sensorId;
	
	private String pinNumber;
	
	private String sensorName;
	
	private String sensorType;
		
	private String macAddress;
	
	private String sensorUUID;
	
	private boolean activated;
	
	private boolean connected;
	
	private long connectedTime;
	
	private long updatedConnected;
	
	public HttpSensorDevice() {
		super();
	}
	
	public HttpSensorDevice(UISensorDevice sensorDevice) {
		this.pinNumber = sensorDevice.getPinNumber();
		this.sensorName = sensorDevice.getSensorName();
		this.sensorType = sensorDevice.getSensorType();
		this.macAddress = sensorDevice.getMacAddress();
		this.sensorUUID = sensorDevice.getSensorUUID();
		this.activated = sensorDevice.isActivated();
		this.connected = sensorDevice.isConnected();
		this.connectedTime = sensorDevice.getConnectedTime();
	}
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("pinNumber=").append(pinNumber).append(", ");
		b.append("sensorType=").append(sensorType).append(", ");
		b.append("sensorName=").append(sensorName).append(", ");
		b.append("macAddress=").append(macAddress).append(", ");
		b.append("sensorUUID=").append(sensorUUID).append(", ");
		b.append("activated=").append(activated).append(", ");
		b.append("connected=").append(connected).append(", ");
		b.append("connectedTime=").append(connectedTime).append(", ");
		b.append("updatedConnected=").append(updatedConnected).append(", ");
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
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return the isActivated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * @param isActivated the isActivated to set
	 */
	public void setActivated(boolean isActivated) {
		this.activated = isActivated;
	}

	/**
	 * @return the sensorUUID
	 */
	public String getSensorUUID() {
		return sensorUUID;
	}

	/**
	 * @param sensorUUID the sensorUUID to set
	 */
	public void setSensorUUID(String sensorUUID) {
		this.sensorUUID = sensorUUID;
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

	/**
	 * @return the connected
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * @param connected the connected to set
	 */
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	/**
	 * @return the connectedTime
	 */
	public long getConnectedTime() {
		return connectedTime;
	}

	/**
	 * @param connectedTime the connectedTime to set
	 */
	public void setConnectedTime(long connectedTime) {
		this.connectedTime = connectedTime;
	}

	/**
	 * @return the updatedConnected
	 */
	public long getUpdatedConnected() {
		return updatedConnected;
	}

	/**
	 * @param updatedConnected the updatedConnected to set
	 */
	public void setUpdatedConnected(long updatedConnected) {
		this.updatedConnected = updatedConnected;
	}

	/**
	 * @return the sensorId
	 */
	public long getSensorId() {
		return sensorId;
	}

	/**
	 * @param sensorId the sensorId to set
	 */
	public void setSensorId(long sensorId) {
		this.sensorId = sensorId;
	}
}
