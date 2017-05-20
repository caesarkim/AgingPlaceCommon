/**
 * AgingPlaceCommon
 */
package com.ap.mobile.model;

/**
 * @author jungwhan
 * NotificationOption.java
 * 4:51:40 PM Apr 13, 2016 2016
 */
public enum NotificationOption {
	SOUND(1, "SOUND"),
	
	VIBRATION(2, "VIBRATION"),
	
	SILENCE(3, "SILENCE");
	
	private String name;
	
	private int optionId;
	
	private NotificationOption(int optionId, String name) {
		this.optionId = optionId;
		this.name = name;
	}
	
	public static int getOptionId(String optionName) {
		if (optionName == null || optionName.isEmpty()) {
			return 0;
		}
		if (optionName.equalsIgnoreCase(SOUND.name)) {
			return SOUND.optionId;
		} else if (optionName.equalsIgnoreCase(VIBRATION.name)) {
			return VIBRATION.optionId;
		} else if (optionName.equalsIgnoreCase(SILENCE.name)) {
			return SILENCE.optionId;
		}
		return 0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the optionId
	 */
	public int getOptionId() {
		return optionId;
	}

	/**
	 * @param optionId the optionId to set
	 */
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
}
