/**
 * AgingPlace
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * CommandPacket.java
 * 8:48:57 PM Feb 2, 2016 2016
 */
public class HttpCommandPacket implements java.io.Serializable {

	private static final long serialVersionUID = -1914759092412998253L;

	private String deviceCode;
	
	private String commandName;
	
	private String commandValue;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("deviceCode=").append(deviceCode).append(", ");
		b.append("commandName=").append(commandName).append(", ");
		b.append("commandValue=").append(commandValue);
		return b.toString();
	}

	/**
	 * @return the deviceCode
	 */
	public String getDeviceCode() {
		return deviceCode;
	}

	/**
	 * @param deviceCode the deviceCode to set
	 */
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	/**
	 * @return the commandName
	 */
	public String getCommandName() {
		return commandName;
	}

	/**
	 * @param commandName the commandName to set
	 */
	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	/**
	 * @return the commandValue
	 */
	public String getCommandValue() {
		return commandValue;
	}

	/**
	 * @param commandValue the commandValue to set
	 */
	public void setCommandValue(String commandValue) {
		this.commandValue = commandValue;
	}
}
