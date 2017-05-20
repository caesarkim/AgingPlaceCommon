/**
 * AgingSafeSenior
 */
package com.ap.common.models.http;

import java.util.Date;

/**
 * @author jungwhan
 * NotificationStatus.java
 * 9:25:35 PM Mar 24, 2016 2016
 */
public class HttpNotification implements java.io.Serializable {

	private static final long serialVersionUID = -4504258410360659772L;
	
	private String extraInfo;

	private long id;
	
	private int notificationType;
	
	private String careReceiverUUID;
	
	private long careReceiverId;
	
	private int intervalType;
	
	private int messageType;
	
	private int status;
	
	private long created;
	
	private Date createTime;
	
	private int received;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("id=").append(id).append(", ");
		b.append("status=").append(status).append(", ");
		b.append("notificationType=").append(notificationType).append(", ");
		b.append("careReceiverUUID=").append(careReceiverUUID).append(", ");
		b.append("extraInfo=").append(extraInfo).append(", ");
		b.append("intervalType=").append(intervalType).append(", ");
		b.append("careReceiverId=").append(careReceiverId).append(", ");
		b.append("messageType=").append(messageType).append(", ");
		b.append("created=").append(created).append(", ");
		b.append("createTime=").append(createTime).append(", ");
		b.append("received=").append(received).append(", ");
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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
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
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the uuid
	 */
	public String getCareReceiverUUID() {
		return careReceiverUUID;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setCareReceiverUUID(String uuid) {
		this.careReceiverUUID = uuid;
	}

	/**
	 * @return the careReceiverId
	 */
	public long getCareReceiverId() {
		return careReceiverId;
	}

	/**
	 * @param careReceiverId the careReceiverId to set
	 */
	public void setCareReceiverId(long careReceiverId) {
		this.careReceiverId = careReceiverId;
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
	 * @return the notificationType
	 */
	public int getNotificationType() {
		return notificationType;
	}

	/**
	 * @param notificationType the notificationType to set
	 */
	public void setNotificationType(int notificationType) {
		this.notificationType = notificationType;
	}

	/**
	 * @return the extraInfo
	 */
	public String getExtraInfo() {
		return extraInfo;
	}

	/**
	 * @param extraInfo the extraInfo to set
	 */
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}
}
