/**
 * AgingPlace
 */
package com.ap.common.models.http;


/**
 * @author jungwhan
 * EventType.java
 * 8:45:12 PM Feb 2, 2016 2016
 */
public enum HttpEventType {
	PING (0, "PING"),
	
	REGISTER (1, "REGISTER"),
	
	SENSOR_EVENT (2, "SENSOR_EVENT");
	
	private int eventId;
	
	private String eventName;
	
	private HttpEventType(int eventId, String eventName) {
		this.eventId = eventId;
		this.eventName = eventName;
	}
	
	public int getEventId(String eventName) {
		if (eventName.equals("REGISTER")) {
			return 1;
		} else if (eventName.equals("SENSOR_EVENT")) {
			return 2;
		}
		return 0;
	}

	/**
	 * @return the eventId
	 */
	public int getEventId() {
		return eventId;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
}
