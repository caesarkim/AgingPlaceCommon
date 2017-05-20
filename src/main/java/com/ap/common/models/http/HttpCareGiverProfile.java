/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * HttpCareGiverProfile.java
 * 2:40:42 PM Mar 30, 2016 2016
 */
public class HttpCareGiverProfile implements java.io.Serializable {

	private static final long serialVersionUID = 5231739678664731250L;

	private String careGiverUUID;
	
	private String pinNumber;
	
	private String careReceiverUUID;
	
	private long careGiverId;
	
	private long careReceiverId;
	
	private String careReceiverName;
	
	private String careReceiverPhoneNumber;
	
	private String careReceiverPicture;
	
	private int primary;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("careGiverUUID=").append(careGiverUUID).append(",");
		b.append("careReceiverUUID=").append(careReceiverUUID).append(",");
		b.append("careGiverId=").append(careGiverId).append(",");
		b.append("careReceiverId=").append(careReceiverId).append(",");
		b.append("careReceiverName=").append(careReceiverName).append(",");
		b.append("careReceiverPhoneNumber=").append(careReceiverPhoneNumber).append(",");
		b.append("careReceiverPicture=").append(careReceiverPicture).append(",");
		b.append("primary=").append(primary).append(",");
		return b.toString();
	}
	
	/**
	 * @return the uuid
	 */
	public String getCareGiverUUID() {
		return careGiverUUID;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setCareGiverUUID(String uuid) {
		this.careGiverUUID = uuid;
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
	 * @return the careReceiverPhoneNumber
	 */
	public String getCareReceiverPhoneNumber() {
		return careReceiverPhoneNumber;
	}

	/**
	 * @param careReceiverPhoneNumber the careReceiverPhoneNumber to set
	 */
	public void setCareReceiverPhoneNumber(String careReceiverPhoneNumber) {
		this.careReceiverPhoneNumber = careReceiverPhoneNumber;
	}

	/**
	 * @return the careReceiverUUID
	 */
	public String getCareReceiverUUID() {
		return careReceiverUUID;
	}

	/**
	 * @param careReceiverUUID the careReceiverUUID to set
	 */
	public void setCareReceiverUUID(String careReceiverUUID) {
		this.careReceiverUUID = careReceiverUUID;
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
	 * @return the careReceiverPicture
	 */
	public String getCareReceiverPicture() {
		return careReceiverPicture;
	}

	/**
	 * @param careReceiverPicture the careReceiverPicture to set
	 */
	public void setCareReceiverPicture(String careReceiverPicture) {
		this.careReceiverPicture = careReceiverPicture;
	}

	/**
	 * @return the primary
	 */
	public int getPrimary() {
		return primary;
	}

	/**
	 * @param primary the primary to set
	 */
	public void setPrimary(int primary) {
		this.primary = primary;
	}
}
