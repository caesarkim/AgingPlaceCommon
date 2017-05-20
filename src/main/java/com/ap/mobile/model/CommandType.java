/**
 * AgingPlaceMobile
 */
package com.ap.mobile.model;

/**
 * @author jungwhan
 * NotificationType.java
 * 11:12:41 PM Mar 12, 2016 2016
 */
public enum CommandType {
	ACTIVATE ("ACTIVATE", 1),
	
	RESET ("RESET", 2),
	
	CHECKSTATUS ("CHECKSTATUS", 3),
	
	RENEW_REGISTRATION_ID ("RENEW_REGISTRATION_ID", 4),
	
	CHECK_SERVICE_RESTART ("CHECK_SERVICE_RESTART", 5),
	
	CHECK_POSITION ("CHECK_POSITION", 6),
	
	CHECK_POSITION_NOTIFICATION ("CHECK_POSITION_NOTIFICATION", 7);
	
	private String command;
	
	private int typeId;
	
	/**
	 * 
	 * @param command
	 * @param typeId
	 */
	private CommandType(String command, int typeId) {
		this.command = command;
		this.typeId = typeId;
	}
	
	public static CommandType getCommandType(String type) {
		if (type.equals(ACTIVATE.name())) {
			return ACTIVATE;
		} else if (type.equals(RESET.name())) {
			return RESET;
		} else if (type.equals(CHECKSTATUS.name())) {
			return CHECKSTATUS;
		}
		return null;
	}
	
	public String getCommand() {
		return this.command;
	}
	
	public int getTypeId() {
		return this.typeId;
	}
}
