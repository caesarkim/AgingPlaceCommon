/**
 * AgingPlaceMobile
 */
package com.ap.common.models.http;

/**
 * @author jungwhan
 * HttpDoctorInfo.java
 * 11:37:35 PM Mar 30, 2016 2016
 */
public class HttpDoctorInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7776439559888756271L;

	private long id;
	
	private boolean canUpdate = false;
	
	private String uuid;
	
	private long careReceiverId;
	
	private String doctorName;
	
	private String doctorPhoneNumber;
	
	private String specialty;
	
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("id=").append(id).append(", ");
		b.append("careReceiverId=").append(careReceiverId).append(", ");
		b.append("uuid=").append(uuid).append(", ");
		b.append("isUpdate=").append(canUpdate).append(", ");
		b.append("doctorName=").append(doctorName).append(", ");
		b.append("doctorPhoneNumber=").append(doctorPhoneNumber).append(", ");
		b.append("specialty=").append(specialty).append(", ");
		return b.toString();
	}
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

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
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * @return the doctorPhoneNumber
	 */
	public String getDoctorPhoneNumber() {
		return doctorPhoneNumber;
	}

	/**
	 * @param doctorPhoneNumber the doctorPhoneNumber to set
	 */
	public void setDoctorPhoneNumber(String doctorPhoneNumber) {
		this.doctorPhoneNumber = doctorPhoneNumber;
	}

	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}


	/**
	 * @return the isUpdate
	 */
	public boolean isCanUpdate() {
		return canUpdate;
	}


	/**
	 * @param isUpdate the isUpdate to set
	 */
	public void setCanUpdate(boolean isUpdate) {
		this.canUpdate = isUpdate;
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
