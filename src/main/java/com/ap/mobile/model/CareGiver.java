/**
 * AgingPlaceMobile
 */
package com.ap.mobile.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jungwhan
 * CareGiver.java
 * 1:42:05 AM Mar 27, 2016 2016
 */
public class CareGiver {
	private List<CareReceiver> careReceivers;
	
	private Map<String, CareReceiver> careReceiversMap = new HashMap<String, CareReceiver>();

	/**
	 * @return the careReceivers
	 */
	public List<CareReceiver> getCareReceivers() {
		return careReceivers;
	}
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("careReceivers=").append(careReceivers).append(", ");
		b.append("careReceiversMap=").append(careReceiversMap).append(", ");
		return b.toString();
	}

	/**
	 * @param careReceivers the careReceivers to set
	 */
	public void setCareReceivers(List<CareReceiver> careReceivers) {
		this.careReceivers = careReceivers;
		for (CareReceiver careReceiver : careReceivers) {
			careReceiversMap.put(careReceiver.getId(), careReceiver);
		}
	}
	
	public CareReceiver getCareReceiver(String id) {
		return careReceiversMap.get(id);
	}
	
	public void changeCareReceiverDefault(CareReceiver selectedCareReceiver) {
		if (careReceivers == null) {
			return;
		}
		for (CareReceiver careReceiver : careReceivers) {
			careReceiver.setSelected(false);
		}
		selectedCareReceiver.setSelected(true);
	}
	
	public CareReceiver getSelectedCareReceiver() {
		if (careReceivers == null) {
			return null;
		}
		for (CareReceiver careReceiver : careReceivers) {
			if (careReceiver.isSelected()) {
				return careReceiver;
			}
		}
		return null;
	}
	
	public List<CareReceiver> getRemainingCareReceivers() {
		List<CareReceiver> nonSelectedCareReceivers = new ArrayList<CareReceiver>();
		for (CareReceiver careReceiver : careReceivers) {
			if (!careReceiver.isSelected()) {
				nonSelectedCareReceivers.add(careReceiver);
			}
		}
		return nonSelectedCareReceivers;
	}
}
