/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jungwhan
 * HttpCareReceiverConnectInfo.java
 * 10:30:10 PM Mar 7, 2016 2016
 */
public class HttpCareReceiverConnectInfo implements java.io.Serializable {

	private static final long serialVersionUID = 8563382085700313398L;

	private String uuid;
	
	private List<HttpConnectTime> connectTime = new ArrayList<HttpConnectTime>();
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("uuid=").append(uuid).append(", ");
		b.append("connectTime=").append(connectTime).append(", ");
		return b.toString();
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
	 * @return the connectTime
	 */
	public List<HttpConnectTime> getConnectTime() {
		return connectTime;
	}
	
	public void addConnectTime(HttpConnectTime currentConnectTime) {
		connectTime.add(currentConnectTime);
	}

	/**
	 * @param connectTime the connectTime to set
	 */
	public void setConnectTime(List<HttpConnectTime> connectTime) {
		this.connectTime = connectTime;
	}
}
