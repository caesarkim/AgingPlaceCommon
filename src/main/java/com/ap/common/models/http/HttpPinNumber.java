/**
 * AgingSafeSenior
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * PinNumberInfo.java
 * 5:34:08 PM Feb 9, 2016 2016
 */
public class HttpPinNumber {
	private long id;
	
	private String pinNumber;
	
	private long userCareGiverId = -1;
	
	private long userCareRecipientId = -1;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("id=").append(id).append(",");
		b.append("pinNumber=").append(pinNumber).append(",");
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
	 * @return the userCareGiverId
	 */
	public long getUserCareGiverId() {
		return userCareGiverId;
	}

	/**
	 * @param userCareGiverId the userCareGiverId to set
	 */
	public void setUserCareGiverId(long userCareGiverId) {
		this.userCareGiverId = userCareGiverId;
	}

	/**
	 * @return the userCareTakerId
	 */
	public long getUserCareRecipientId() {
		return userCareRecipientId;
	}

	/**
	 * @param userCareTakerId the userCareTakerId to set
	 */
	public void setUserCareRecipientId(long userCareTakerId) {
		this.userCareRecipientId = userCareTakerId;
	}
}
