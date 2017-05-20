/**
 * AgingSafeSenior
 */
package com.ap.common.models.http;

/**
 * @author jungwhan Constants.java 10:58:16 PM Feb 10, 2016 2016
 */
public class HttpStatusConstants {
	public final static String STATUS_SUCCESS = "success";

	public final static String STATUS_FAILURE = "failure";

	public final static String STATUS_NOT_EXISTS = "not_exists";

	public final static String STATUS_USER_NOT_EXISTS = "user_not_exists";
	
	public final static String STATUS_CARE_GIVER_NOT_EXISTS = "care_giver_not_exists";
	
	public final static String STATUS_CARE_RECEIVER_NOT_EXISTS = "care_receiver_not_exists";
	
	public final static String STATUS_NOT_AUTHORIZED = "not_authorized";
	
	public final static String STATUS_ALREADY_EXISTS = "already_exists";

	public final static int STATUS_WRONG_PIN = 10000;

	public final static int STATUS_PIN_ALREADY_EXISTS = 20000;
	
	public final static int STATUS_STOP = 30000;
	
	public final static String NOTIFICATION_PROPERTY_COMMAND_NAME = "commandName";
	
	public final static String NOTIFICATION_PROPERTY_NOTIFICATION_TYPE = "notificationType";

	public final static String NOTIFICATION_PROPERTY_UUID = "uuid";
	
	public final static String NOTIFICATION_PROPERTY_CARE_GIVER_UUID = "care_giver_uuid";
	
	public final static String NOTIFICATION_PROPERTY_CREATED = "created";
	
	public final static String NOTIFICATION_PROPERTY_NOTIFICATION_MESSAGE = "notificationMessage";
	
	public final static String NOTIFICATION_PROPERTY_NOTIFICATION_MESSAGE_TEMPLATE = "notificationMessageTemplate";
	
	public final static String NOTIFICATION_PROPERTY_CARETYPE = "careType";
	
	public final static String NOTIFICATION_PROPERTY_NOTIFICATION_DETAIL_ID = "notificationDetailId";
	
	public final static String NOTIFICATION_PROPERTY_NOTIFICATION_MAIN_ID = "notificationMainId";
	
	public final static String NOTIFICATION_PROPERTY_NOTIFICATION_ID = "notificationId";
	
	public final static String NOTIFICATION_PROPERTY_CARE_RECEIVER_PHONE_NUMBER = "CARE_RECEIVER_PHONE_NUMBER ";
	
	public final static String NOTIFICATION_PROPERTY_CARE_RECEIVER_JSON = "CATION_PROPERTY_CARE_RECEIVER_JSON";
	
	public final static String NOTIFICATION_PROPERTY_CARE_RECEIVER_NAME  = "CARE_RECEIVER_NAME";
	
	public final static String NOTIFICATION_PROPERTY_CARE_RECEIVER_ID  = "CARE_RECEIVER_ID";
}
