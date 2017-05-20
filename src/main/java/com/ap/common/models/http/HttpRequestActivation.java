/**
 * AgingPlace
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * RequestActivation.java
 * 12:38:24 AM Feb 3, 2016 2016
 */
public class HttpRequestActivation {
	private String activationCode;
	
	private String password;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("activationCode=").append(activationCode).append(", ");
		b.append("password=").append(password).append(", ");
		return b.toString();
	}

	/**
	 * @return the activationCode
	 */
	public String getActivationCode() {
		return activationCode;
	}

	/**
	 * @param activationCode the activationCode to set
	 */
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
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
}
