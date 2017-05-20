/**
 * AgingPlaceMobile
 */
package com.ap.mobile.model;

/**
 * @author jungwhan
 * InactivityNotification.java
 * 10:43:52 PM Mar 28, 2016 2016
 */
public class InactivityNotification {
	private String message;
	
	private int messageType;
	
	private String friendlyTime;
	
	private long created;
	
	public InactivityNotification(String message, String friendlyTime) {
		this.message = message;
		this.friendlyTime = friendlyTime;
	}
	
	@Override
	public int hashCode() {
		return message.hashCode() + friendlyTime.hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof InactivityNotification)) {
			return false;
		}
		InactivityNotification notification = (InactivityNotification)obj;
		return (notification.getMessage().equals(getMessage()) && notification.getFriendlyTime().equals(getFriendlyTime()) && notification.getCreated() == getCreated());
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the friendlyTime
	 */
	public String getFriendlyTime() {
		return friendlyTime;
	}

	/**
	 * @param friendlyTime the friendlyTime to set
	 */
	public void setFriendlyTime(String friendlyTime) {
		this.friendlyTime = friendlyTime;
	}

	/**
	 * @return the created
	 */
	public long getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(long created) {
		this.created = created;
	}

	/**
	 * @return the messageType
	 */
	public int getMessageType() {
		return messageType;
	}

	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}
}
