/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

import java.util.Map;

/**
 * @author jungwhan
 * HttpCareReceiverStat.java
 * 4:20:01 PM Mar 6, 2016 2016
 */
public class HttpCareReceiverStat implements java.io.Serializable {

	private static final long serialVersionUID = 3158891657969136721L;

	private String uuid;
	
	private String timestamp;
	
	private int timeId;
	
	private String dateStamp;
	
	private Map<Integer, Integer> stat;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("uuid=").append(uuid).append(", ");
		b.append("timeId=").append(timeId).append(", ");
		b.append("timestamp=").append(timestamp).append(", ");
		b.append("dateStamp=").append(dateStamp).append(", ");
		b.append("stat=").append(stat).append(", ");
		return b.toString();
	}

	/**
	 * @return the stat
	 */
	public Map<Integer, Integer> getStat() {
		return stat;
	}

	/**
	 * @param stat the stat to set
	 */
	public void setStat(Map<Integer, Integer> stat) {
		this.stat = stat;
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
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the dateStamp
	 */
	public String getDateStamp() {
		return dateStamp;
	}

	/**
	 * @param dateStamp the dateStamp to set
	 */
	public void setDateStamp(String dateStamp) {
		this.dateStamp = dateStamp;
	}

	/**
	 * @return the timeId
	 */
	public int getTimeId() {
		return timeId;
	}

	/**
	 * @param timeId the timeId to set
	 */
	public void setTimeId(int timeId) {
		this.timeId = timeId;
	}

}
