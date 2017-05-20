/**
 * AgingSafeSenior
 */
package com.ap.common.models.http;


/**
 * @author jungwhan
 * User.java
 * 5:33:55 PM Feb 9, 2016 2016
 */
public class HttpCareGiver implements java.io.Serializable {

	private static final long serialVersionUID = -4443767955591528961L;

	private long id;
	
	private String timezone;
	
	private int primaryCareGiver;
	
	private String uuid;
	
	private String emailAddress;
	
	private String platform;
	
	private String password;
	
	private String tempPassword;
	
	private int resetValue;
	
	private String pinNumber;
	
	private int activated;
	
	private String careRcvrProfilePicture;
	
	private String careRcvrName;
	
	private String careRcvrPhoneNumber;
	
	private String phoneNumber;
	
	private String registrationId;
	
	private String deviceBrand;
	
	private String deviceManufacturer;
	
	private String deviceModel;
	
	private String platformVersion;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("userId=").append(id).append(",");
		b.append("emailAddress=").append(emailAddress).append(",");
		b.append("resetValue=").append(resetValue).append(",");
		b.append("phoneNumber=").append(phoneNumber).append(",");
		b.append("careRcvrProfilePicture=").append(careRcvrProfilePicture).append(",");
		b.append("uuid=").append(uuid).append(",");
		b.append("activated=").append(activated).append(",");
		b.append("careRcvrName=").append(careRcvrName).append(",");
		b.append("careRcvrPhoneNumber=").append(careRcvrPhoneNumber).append(",");
		b.append("pinNumber=").append(pinNumber).append(",");
		b.append("registrationId=").append(registrationId).append(",");
		b.append("deviceBrand=").append(deviceBrand).append(",");
		b.append("deviceManufacturer=").append(deviceManufacturer).append(",");
		b.append("deviceModel=").append(deviceModel).append(",");
		b.append("platform=").append(platform).append(",");
		b.append("primaryCareGiver=").append(primaryCareGiver).append(",");
		b.append("platformVersion=").append(platformVersion).append(",");
		return b.toString();
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the userId
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setId(long userId) {
		this.id = userId;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the careRcvrName
	 */
	public String getCareRcvrName() {
		return careRcvrName;
	}

	/**
	 * @param careRcvrName the careRcvrName to set
	 */
	public void setCareRcvrName(String careRcvrName) {
		this.careRcvrName = careRcvrName;
	}

	/**
	 * @return the careRcvrPhoneNumber
	 */
	public String getCareRcvrPhoneNumber() {
		return careRcvrPhoneNumber;
	}

	/**
	 * @param careRcvrPhoneNumber the careRcvrPhoneNumber to set
	 */
	public void setCareRcvrPhoneNumber(String careRcvrPhoneNumber) {
		this.careRcvrPhoneNumber = careRcvrPhoneNumber;
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
	 * @return the registrationId
	 */
	public String getRegistrationId() {
		return registrationId;
	}

	/**
	 * @param registrationId the registrationId to set
	 */
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	/**
	 * @return the deviceBrand
	 */
	public String getDeviceBrand() {
		return deviceBrand;
	}

	/**
	 * @param deviceBrand the deviceBrand to set
	 */
	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
	}

	/**
	 * @return the deviceManufacturer
	 */
	public String getDeviceManufacturer() {
		return deviceManufacturer;
	}

	/**
	 * @param deviceManufacturer the deviceManufacturer to set
	 */
	public void setDeviceManufacturer(String deviceManufacturer) {
		this.deviceManufacturer = deviceManufacturer;
	}

	/**
	 * @return the deviceModel
	 */
	public String getDeviceModel() {
		return deviceModel;
	}

	/**
	 * @param deviceModel the deviceModel to set
	 */
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	/**
	 * @return the activated
	 */
	public int getActivated() {
		return activated;
	}

	/**
	 * @param activated the activated to set
	 */
	public void setActivated(int activated) {
		this.activated = activated;
	}

	/**
	 * @return the profilePicture
	 */
	public String getCareRcvrProfilePicture() {
		return careRcvrProfilePicture;
	}

	/**
	 * @param profilePicture the profilePicture to set
	 */
	public void setCareRcvrProfilePicture(String profilePicture) {
		this.careRcvrProfilePicture = profilePicture;
	}

	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * @return the tempPassword
	 */
	public String getTempPassword() {
		return tempPassword;
	}

	/**
	 * @param tempPassword the tempPassword to set
	 */
	public void setTempPassword(String tempPassword) {
		this.tempPassword = tempPassword;
	}

	/**
	 * @return the isReset
	 */
	public int getResetValue() {
		return resetValue;
	}

	/**
	 * @param isReset the isReset to set
	 */
	public void setResetValue(int resetValue) {
		this.resetValue = resetValue;
	}

	/**
	 * @return the primaryCareGiver
	 */
	public int getPrimaryCareGiver() {
		return primaryCareGiver;
	}

	/**
	 * @param primaryCareGiver the primaryCareGiver to set
	 */
	public void setPrimaryCareGiver(int primaryCareGiver) {
		this.primaryCareGiver = primaryCareGiver;
	}

	/**
	 * @return the platformVersion
	 */
	public String getPlatformVersion() {
		return platformVersion;
	}

	/**
	 * @param platformVersion the platformVersion to set
	 */
	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
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
