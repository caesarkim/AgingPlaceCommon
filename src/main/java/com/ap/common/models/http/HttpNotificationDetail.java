/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * HttpNotification.java
 * 10:23:15 PM Mar 8, 2016 2016
 */
public class HttpNotificationDetail implements java.io.Serializable {
	private static final long serialVersionUID = 8740907777454678769L;

	private long id;
	
	private long notificationStatusId;
	
	private int intervalType;
	
	private int messageType;
	
	private String message;
	
	private long created;
	
	private int confirmed;
	
	private long requestTime;
	
	private String gcmMessageId;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("id=").append(id).append(", ");
		b.append("notificationStatusId=").append(notificationStatusId).append(", ");
		b.append("intervalType=").append(intervalType).append(", ");
		b.append("messageType=").append(messageType).append(", ");
		b.append("message=").append(message).append(", ");
		b.append("created=").append(created).append(", ");
		b.append("confirmed=").append(confirmed).append(", ");
		b.append("gcmMessageId=").append(gcmMessageId).append(", ");
		b.append("requestTime=").append(requestTime).append(", ");
		return b.toString();
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
	 * @return the confirmed
	 */
	public int getConfirmed() {
		return confirmed;
	}

	/**
	 * @param confirmed the confirmed to set
	 */
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the intervalType
	 */
	public int getIntervalType() {
		return intervalType;
	}

	/**
	 * @param intervalType the intervalType to set
	 */
	public void setIntervalType(int intervalType) {
		this.intervalType = intervalType;
	}

	/**
	 * @return the notificationStatusId
	 */
	public long getNotificationStatusId() {
		return notificationStatusId;
	}

	/**
	 * @param notificationStatusId the notificationStatusId to set
	 */
	public void setNotificationStatusId(long notificationStatusId) {
		this.notificationStatusId = notificationStatusId;
	}

	/**
	 * @return the requestTime
	 */
	public long getRequestTime() {
		return requestTime;
	}

	/**
	 * @param requestTime the requestTime to set
	 */
	public void setRequestTime(long requestTime) {
		this.requestTime = requestTime;
	}

	/**
	 * @return the gcmMessageId
	 */
	public String getGcmMessageId() {
		return gcmMessageId;
	}

	/**
	 * @param gcmMessageId the gcmMessageId to set
	 */
	public void setGcmMessageId(String gcmMessageId) {
		this.gcmMessageId = gcmMessageId;
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
