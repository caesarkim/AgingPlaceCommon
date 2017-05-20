/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * HttpConnectTime.java
 * 10:52:10 PM Mar 7, 2016 2016
 */
public class HttpConnectTime implements java.io.Serializable {

	private static final long serialVersionUID = -5009956941796301971L;

	private long sensorId;
	
	private int connectType;
	
	private long currentTime;
	
	public HttpConnectTime() {
		super();
	}
	
	public HttpConnectTime(int connectType, long time) {
		this.connectType = connectType;
		this.currentTime = time;
	}

	/**
	 * @return the connectType
	 */
	public int getConnectType() {
		return connectType;
	}

	/**
	 * @param connectType the connectType to set
	 */
	public void setConnectType(int connectType) {
		this.connectType = connectType;
	}

	/**
	 * @return the currentTime
	 */
	public long getCurrentTime() {
		return currentTime;
	}

	/**
	 * @param currentTime the currentTime to set
	 */
	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
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
