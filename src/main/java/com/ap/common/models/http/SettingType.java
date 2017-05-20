/**
 * AgingPlaceCommon
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * SettingType.java
 * 4:58:44 PM Apr 10, 2016 2016
 */
public enum SettingType {
	NOTIFICATION ("NOTIFICATION", 1),
	
	NOTIFICATION_OPTION ("NOTIFICATION_OPTION", 2);
	
	private String typeName;
	
	private int typeId;
	
	private SettingType(String name, int type) {
		this.typeName = name;
		this.typeId = type;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @return the typeId
	 */
	public int getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
}
