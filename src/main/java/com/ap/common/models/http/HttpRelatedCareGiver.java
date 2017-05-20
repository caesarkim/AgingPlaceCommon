/**
 * AgingPlaceCommon
 */
package com.ap.common.models.http;

/**
 *  Copyright (C) Projecteria LLC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by jungwhan Projecteria LLC, May 4, 2016
 */

/**
 * @author jungwhan
 * HttpRelatedCareGiver.java
 * 11:24:07 AM May 4, 2016 2016
 */
public class HttpRelatedCareGiver implements java.io.Serializable {
	private static final long serialVersionUID = 9152593641412789646L;
	
	private long careGiverId;
	
	private String careGiverUUID;
	
	private long careReceiverId;
	
	private String careGiverEmailAddress;
	
	private String pinNumber;
	
	private String careReceiverName;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("careGiverId=").append(careGiverId).append(", ");
		b.append("careGiverEmailAddress=").append(careGiverEmailAddress).append(", ");
		b.append("pinNumber=").append(pinNumber).append(", ");
		b.append("careGiverUUID=").append(careGiverUUID).append(", ");
		b.append("careReceiverName=").append(careReceiverName).append(", ");
		b.append("careReceiverId=").append(careReceiverId).append(", ");
		return b.toString();
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
	 * @return the careGiverEmailAddress
	 */
	public String getCareGiverEmailAddress() {
		return careGiverEmailAddress;
	}

	/**
	 * @param careGiverEmailAddress the careGiverEmailAddress to set
	 */
	public void setCareGiverEmailAddress(String careGiverEmailAddress) {
		this.careGiverEmailAddress = careGiverEmailAddress;
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
	 * @return the careReceiverName
	 */
	public String getCareReceiverName() {
		return careReceiverName;
	}

	/**
	 * @param careReceiverName the careReceiverName to set
	 */
	public void setCareReceiverName(String careReceiverName) {
		this.careReceiverName = careReceiverName;
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
	 * @return the careGiverUUID
	 */
	public String getCareGiverUUID() {
		return careGiverUUID;
	}

	/**
	 * @param careGiverUUID the careGiverUUID to set
	 */
	public void setCareGiverUUID(String careGiverUUID) {
		this.careGiverUUID = careGiverUUID;
	}
}
