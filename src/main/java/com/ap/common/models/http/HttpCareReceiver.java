/**
 * AgingSafeSenior
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * HttpCareReceiver.java
 * 1:28:24 AM Mar 3, 2016 2016
 */
public class HttpCareReceiver implements java.io.Serializable {

	private static final long serialVersionUID = -7712379328995939404L;

	private long id;
	
	private String timezone;
	
	private long pinNumberId;
	
	private String pinNumber;
	
	private String platform;
	
	private String phoneNumber;
	
	private int activated;
	
	private long activateTime;
	
	private int connected;
	
	private long connectTime;
	
	private double latitude;
	
	private double longitude;
	
	private double recentLatitude;
	
	private double recentLongitude;
	
	private String uuid;
	
	private String registrationId;
	
	private String deviceBrand;
	
	private String deviceManufacturer;
	
	private String deviceModel;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("id=").append(id).append(",");
		b.append("timezone=").append(timezone).append(",");
		b.append("pinNumberId=").append(pinNumberId).append(",");
		b.append("phoneNumber=").append(phoneNumber).append(",");
		b.append("activated=").append(activated).append(",");
		b.append("activateTime=").append(activateTime).append(",");
		b.append("connected=").append(connected).append(",");
		b.append("connect_time=").append(connectTime).append(",");
		b.append("latitude=").append(latitude).append(",");
		b.append("longitude=").append(longitude).append(",");
		b.append("recentLatitude=").append(recentLatitude).append(",");
		b.append("recentLongitude=").append(recentLongitude).append(",");
		b.append("uuid=").append(uuid).append(",");
		b.append("registrationId=").append(registrationId).append(",");
		b.append("deviceBrand=").append(deviceBrand).append(",");
		b.append("deviceManufacturer=").append(deviceManufacturer).append(",");
		b.append("deviceModel=").append(deviceModel).append(",");
		b.append("platform=").append(platform).append(",");
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
	 * @return the pinNumberId
	 */
	public long getPinNumberId() {
		return pinNumberId;
	}

	/**
	 * @param pinNumberId the pinNumberId to set
	 */
	public void setPinNumberId(long pinNumberId) {
		this.pinNumberId = pinNumberId;
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
	 * @return the activate_time
	 */
	public long getActivateTime() {
		return activateTime;
	}

	/**
	 * @param activate_time the activate_time to set
	 */
	public void setActivateTime(long activate_time) {
		this.activateTime = activate_time;
	}

	/**
	 * @return the connected
	 */
	public int getConnected() {
		return connected;
	}

	/**
	 * @param connected the connected to set
	 */
	public void setConnected(int connected) {
		this.connected = connected;
	}

	/**
	 * @return the connect_time
	 */
	public long getConnectTime() {
		return connectTime;
	}

	/**
	 * @param connect_time the connect_time to set
	 */
	public void setConnectTime(long connect_time) {
		this.connectTime = connect_time;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
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

	/**
	 * @return the recentLatitude
	 */
	public double getRecentLatitude() {
		return recentLatitude;
	}

	/**
	 * @param recentLatitude the recentLatitude to set
	 */
	public void setRecentLatitude(double recentLatitude) {
		this.recentLatitude = recentLatitude;
	}

	/**
	 * @return the recentLongitude
	 */
	public double getRecentLongitude() {
		return recentLongitude;
	}

	/**
	 * @param recentLongitude the recentLongitude to set
	 */
	public void setRecentLongitude(double recentLongitude) {
		this.recentLongitude = recentLongitude;
	}
}
