/**
 * AgingPlaceMobile
 */
package com.ap.mobile.model;


/**
 * @author jungwhan
 * CareReceiver.java
 * 1:42:15 AM Mar 27, 2016 2016
 */
public class CareReceiver {
	private String id;
	
	private String pinNumber;
	
	private String uuid;
	
	private long careReceiverId;
	
	private boolean isSelected;
	
	private String careReceiverName;
	
	private String careReceiverPhoneNumber;
	
	private String careReceiverPicture;
	
	private String imageSrc;
	
	private String primaryCareGiverUUID;
	
	@Override
	public int hashCode() {
		return (id + careReceiverName + careReceiverPhoneNumber).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CareReceiver)) {
			return false;
		}
		CareReceiver careReceiver = (CareReceiver)obj;
		if (careReceiver.getId().equals(getId()) && careReceiver.getCareReceiverName().equals(getCareReceiverName()) && careReceiver.getCareReceiverPhoneNumber().equals(getCareReceiverPhoneNumber())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("id=").append(id).append(", ");
		b.append("careReceiverId=").append(careReceiverId).append(", ");
		b.append("isSelected=").append(isSelected).append(", ");
		b.append("careReceiverName=").append(careReceiverName).append(", ");
		b.append("careReceiverPhoneNumber=").append(careReceiverPhoneNumber).append(", ");
		b.append("careReceiverPicture=").append(careReceiverPicture).append(", ");
		b.append("imageSrc=").append(imageSrc).append(", ");
		return b.toString();
	}
	
	public CareReceiver() {
		super();
	}
	
	public CareReceiver(String id, long careReceiverId, boolean isSelected, String careReceiverName, String careReceiverPhoneNumber) {
		this.id = id;
		this.careReceiverId = careReceiverId;
		this.isSelected = isSelected;
		this.careReceiverName = careReceiverName;
		this.careReceiverPhoneNumber = careReceiverPhoneNumber;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the isSelected
	 */
	public boolean isSelected() {
		return isSelected;
	}

	/**
	 * @param isSelected the isSelected to set
	 */
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
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
	 * @return the imageSrc
	 */
	public String getImageSrc() {
		return imageSrc;
	}

	/**
	 * @param imageSrc the imageSrc to set
	 */
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
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
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	 * @return the primaryCareGiverUUID
	 */
	public String getPrimaryCareGiverUUID() {
		return primaryCareGiverUUID;
	}

	/**
	 * @param primaryCareGiverUUID the primaryCareGiverUUID to set
	 */
	public void setPrimaryCareGiverUUID(String primaryCareGiverUUID) {
		this.primaryCareGiverUUID = primaryCareGiverUUID;
	}
}
