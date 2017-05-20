/**
 * AgingPlaceMobile
 */
package com.ap.mobile.model;

/**
 * @author jungwhan
 * DoctorInfoData.java
 * 4:14:33 PM Apr 3, 2016 2016
 */
public class DoctorInfoData {
	private long id;
	
	private String doctorNameContact;
	
	private String phoneNumber;
	
	private String specialty;
	
	@Override
	public int hashCode() {
		return doctorNameContact.hashCode() + specialty.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof DoctorInfoData)) {
			return false;
		}
		DoctorInfoData doctorInfo = (DoctorInfoData)obj;
		if (doctorInfo.getDoctorNameContact().equals(getDoctorNameContact()) && doctorInfo.getSpecialty().equals(getSpecialty())) {
			return true;
		}
		return false;
	}

	/**
	 * @return the doctorNameContact
	 */
	public String getDoctorNameContact() {
		return doctorNameContact;
	}

	/**
	 * @param doctorNameContact the doctorNameContact to set
	 */
	public void setDoctorNameContact(String doctorNameContact) {
		this.doctorNameContact = doctorNameContact;
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
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
