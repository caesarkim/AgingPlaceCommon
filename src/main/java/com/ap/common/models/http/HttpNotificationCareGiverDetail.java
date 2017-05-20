/**
 * aging-safesenior-core
 */
package com.ap.common.models.http;

import java.util.Date;

/**
 *  Copyright (C) Projecteria LLC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by jungwhan Projecteria LLC, May 3, 2016
 */

/**
 * @author jungwhan
 * HttpNotificationCareGiverDetail.java
 * 12:54:06 PM May 3, 2016 2016
 */
public class HttpNotificationCareGiverDetail implements java.io.Serializable {
	private static final long serialVersionUID = 1936796870051090454L;

	private long id;
	
	private long notificationDetailId;
	
	private long careGiverId;
	
	private int intervalType;
	
	private Date created;
	
	private String gcmMessageId;
	
	private int received;
	
	private Date receivedTime;
	
	private int retry;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("id=").append(id).append(", ");
		b.append("notificationDetailId=").append(notificationDetailId).append(", ");
		b.append("intervalType=").append(intervalType).append(", ");
		b.append("careGiverId=").append(careGiverId).append(", ");
		b.append("created=").append(created).append(", ");
		b.append("gcmMessageId=").append(gcmMessageId).append(", ");
		b.append("received=").append(received).append(", ");
		b.append("receivedTime=").append(receivedTime).append(", ");
		b.append("retry=").append(retry).append(", ");
		return b.toString();
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
	 * @return the notificationDetailId
	 */
	public long getNotificationDetailId() {
		return notificationDetailId;
	}

	/**
	 * @param notificationDetailId the notificationDetailId to set
	 */
	public void setNotificationDetailId(long notificationDetailId) {
		this.notificationDetailId = notificationDetailId;
	}

	/**
	 * @return the careGiverId
	 */
	public long getCareGiverId() {
		return careGiverId;
	}

	/**
	 * @param careGiverId the careGiverId to set
	 */
	public void setCareGiverId(long careGiverId) {
		this.careGiverId = careGiverId;
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
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
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
	 * @return the received
	 */
	public int getReceived() {
		return received;
	}

	/**
	 * @param received the received to set
	 */
	public void setReceived(int received) {
		this.received = received;
	}

	/**
	 * @return the receivedTime
	 */
	public Date getReceivedTime() {
		return receivedTime;
	}

	/**
	 * @param receivedTime the receivedTime to set
	 */
	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}

	/**
	 * @return the retry
	 */
	public int getRetry() {
		return retry;
	}

	/**
	 * @param retry the retry to set
	 */
	public void setRetry(int retry) {
		this.retry = retry;
	}
}
