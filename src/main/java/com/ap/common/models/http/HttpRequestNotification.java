/**
 * AgingPlace
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * RequestNotification.java
 * 12:39:25 AM Feb 3, 2016 2016
 */
public class HttpRequestNotification implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2738027697787409691L;

	private String activationCode;
	
	private String notificationEvent;
	
	private long timestamp;
	
	private String timezone;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("activationCode=").append(activationCode).append(", ");
		b.append("notificationEvent=").append(notificationEvent).append(", ");
		b.append("timestamp=").append(timestamp).append(", ");
		b.append("timezone=").append(timezone).append(", ");
		return b.toString();
	}

	/**
	 * @return the activationCode
	 */
	public String getActivationCode() {
		return activationCode;
	}

	/**
	 * @param activationCode the activationCode to set
	 */
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	/**
	 * @return the notificationEvent
	 */
	public String getNotificationEvent() {
		return notificationEvent;
	}

	/**
	 * @param notificationEvent the notificationEvent to set
	 */
	public void setNotificationEvent(String notificationEvent) {
		this.notificationEvent = notificationEvent;
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
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
}
