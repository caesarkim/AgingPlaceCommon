/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * PacketValue.java
 * 2:21:43 PM Feb 9, 2016 2016
 */
public enum HttpPacketValue {
	PING(0, "PING"),
	
	REGISTER_SUCCESSFUL(1, "REGISTER_SUCCESSFUL");
	
	
	private int packetValueId;
	
	private String packetValue;
	
	private HttpPacketValue(int packetValueId, String packetValue) {
		this.packetValueId = packetValueId;
		this.packetValue = packetValue;
	}

	/**
	 * @return the packetValueId
	 */
	public int getPacketValueId() {
		return packetValueId;
	}

	/**
	 * @param packetValueId the packetValueId to set
	 */
	public void setPacketValueId(int packetValueId) {
		this.packetValueId = packetValueId;
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
}
