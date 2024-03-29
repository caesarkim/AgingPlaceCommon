/**
 * AgingPlace
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * DataPacket.java
 * 8:41:48 PM Feb 2, 2016 2016
 */
public class HttpDataPacket implements java.io.Serializable {

	private static final long serialVersionUID = 4420320707288483303L;

	private String sensorType;
	
	private String sensorName;
	
	private String sensorLocation;
	
	private String packetType;
	
	private String packetValue;
	
	private long timestamp;
	
	private String batteryLevel;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("sensorType=").append(sensorType).append(", ");
		b.append("sensorName=").append(sensorName).append(", ");
		b.append("sensorLocation=").append(sensorLocation).append(", ");
		b.append("packetType=").append(packetType).append(", ");
		b.append("packetValue=").append(packetValue).append(", ");
		b.append("timestamp=").append(timestamp).append(", ");
		b.append("batteryLevel=").append(batteryLevel).append(", ");
		return b.toString();
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
	 * @return the sensorLocation
	 */
	public String getSensorLocation() {
		return sensorLocation;
	}

	/**
	 * @param sensorLocation the sensorLocation to set
	 */
	public void setSensorLocation(String sensorLocation) {
		this.sensorLocation = sensorLocation;
	}

	/**
	 * @return the packetType
	 */
	public String getPacketType() {
		return packetType;
	}

	/**
	 * @param packetType the packetType to set
	 */
	public void setPacketType(String packetType) {
		this.packetType = packetType;
	}

	/**
	 * @return the packetValue
	 */
	public String getPacketValue() {
		return packetValue;
	}

	/**
	 * @param packetValue the packetValue to set
	 */
	public void setPacketValue(String packetValue) {
		this.packetValue = packetValue;
	}

	/**
	 * @return the timestamp
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
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
	
}
