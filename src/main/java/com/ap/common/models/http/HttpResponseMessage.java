/**
 * AgingSafeSenior
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * HttpResponseMessage.java
 * 10:37:14 PM Feb 10, 2016 2016
 */
public class HttpResponseMessage<T> implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7955642462182353466L;

	private int statusCode;
	
	private String message;
	
	private T object;
	
	public HttpResponseMessage(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}
	
	public HttpResponseMessage(int statusCode, String message, T t) {
		this.statusCode = statusCode;
		this.message = message;
		this.object = t;
	}
	
	public T getObject() {
		return this.object;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
