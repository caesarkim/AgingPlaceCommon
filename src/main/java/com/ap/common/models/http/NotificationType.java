/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * NotificationType.java
 * 10:00:26 PM Apr 4, 2016 2016
 */
public enum NotificationType {
	NOTIFICATION_DISPLAY(1, "NOTIFICATION_DISPLAY", true, -1),
	
	NOTIFICATION_CLEAR(2, "NOTIFICATION_CLEAR", false, 0),
	
	BATTERY_LOW(3, "BATTERY_LOW", true, 0),
	
	EXCESSIVE_ACTIVITY_AT_NIGHT(4, "EXCESSIVE_ACTIVITY_AT_NIGHT", true, 4),
	
	UNINSTALL_PACKAGE(5, "UNINSTALL_PACKAGE", false, 5),
	
	MOBILE_COMMAND(6, "MOBILE_COMMAND", false, 6),
	
	START_SERVICE(7, "START_SERVICE", false, 7),
	
	CARE_RECEIVER_POSITION(8, "CARE_RECEIVER_POSITION", true, 0);
	
	private int typeId;
	
	private String type;
	
	private boolean display = false;
	
	private int defaultInterval;
	
	private NotificationType(int typeId, String type, boolean display, int defaultInterval) {
		this.typeId = typeId;
		this.type = type;
		this.display = display;
		this.defaultInterval = defaultInterval;
	}
	
	public static NotificationType getNotificationType(int type) {
		switch (type) {
			case 1:
				return NotificationType.NOTIFICATION_DISPLAY;
			case 2:
				return NotificationType.NOTIFICATION_CLEAR;
			case 3:
				return NotificationType.BATTERY_LOW;
			case 4:
				return NotificationType.EXCESSIVE_ACTIVITY_AT_NIGHT;
			case 5:
				return NotificationType.UNINSTALL_PACKAGE;
			case 6:
				return NotificationType.MOBILE_COMMAND;
			case 7:
				return NotificationType.START_SERVICE;
			case 8:
				return NotificationType.CARE_RECEIVER_POSITION;
		}
		return null;
	}
	
	public int getTypeId() {
		return this.typeId;
	}
	
	public String getType() {
		return this.type;
	}

	/**
	 * @return the display
	 */
	public boolean isDisplay() {
		return display;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getDisplay() {
		return display ? 1 : 0;
	}

	/**
	 * @return the defaultInterval
	 */
	public int getDefaultInterval() {
		return defaultInterval;
	}
}
