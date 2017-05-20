/**
 * AgingSafeSenior
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * CareGiverSetting.java
 * 9:12:43 PM Mar 10, 2016 2016
 */
public class HttpCareGiverSetting implements java.io.Serializable {

	private static final long serialVersionUID = -3138553212302644488L;

	private long id;
	
	private String uuid;
	
	private long careGiverId;
	
	private long careReceiverId;
	
	private int type;
	
	private String settingValue;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("id=").append(id).append(",");
		b.append("uuid=").append(uuid).append(",");
		b.append("careGiverId=").append(careGiverId).append(",");
		b.append("careReceiverId=").append(careReceiverId).append(",");
		b.append("type=").append(type).append(",");
		b.append("settingValue=").append(settingValue).append(",");
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
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the settingValue
	 */
	public String getSettingValue() {
		return settingValue;
	}

	/**
	 * @param settingValue the settingValue to set
	 */
	public void setSettingValue(String settingValue) {
		this.settingValue = settingValue;
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
}
