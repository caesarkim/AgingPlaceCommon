/**
 * AgingSafeSenior
 */
package com.ap.common.models.http;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jungwhan
 * CareReceiverLog.java
 * 11:36:08 AM Apr 12, 2016 2016
 */
public class HttpCareReceiverLog implements java.io.Serializable {

	private static final long serialVersionUID = -5059040688211180312L;

	private long careReceiverId;
	
	private long timeId;
	
	private Map<Integer, Integer> hourlyLog = new HashMap<Integer, Integer>();

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

	/**
	 * @return the timeId
	 */
	public long getTimeId() {
		return timeId;
	}

	/**
	 * @param timeId the timeId to set
	 */
	public void setTimeId(long timeId) {
		this.timeId = timeId;
	}

	/**
	 * @return the hourlyLog
	 */
	public Map<Integer, Integer> getHourlyLog() {
		return hourlyLog;
	}

	/**
	 * @param hourlyLog the hourlyLog to set
	 */
	public void setHourlyLog(Map<Integer, Integer> hourlyLog) {
		this.hourlyLog = hourlyLog;
	}
}
