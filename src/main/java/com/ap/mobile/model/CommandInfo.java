/**
 * AgingPlaceMobile
 */
package com.ap.mobile.model;

/**
 * @author jungwhan
 * CommandInfo.java
 * 1:05:48 AM Mar 13, 2016 2016
 */
public class CommandInfo implements java.io.Serializable {
	private static final long serialVersionUID = 4383037756511358655L;

	private String command;
	
	private String uuid;

	/**
	 * @return the command
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * @param command the command to set
	 */
	public void setCommand(String command) {
		this.command = command;
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
}
