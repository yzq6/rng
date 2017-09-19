package com.zhiyou100.ssm.util;

public class ConstantUtils {
	public static final Integer SEND_STATUS_DRAFT = 0 ; //send_status
	public static final Integer SEND_STATUS_SUCCESS = 2;
	public static final Integer RECEIVE_STATUS_UNREAD = 0 ; //send_status
	public static final Integer RECEIVE_STATUS_READ = 2;
	public static final Integer SEND_DELETE_NORMAL = 2;
	/** 逻辑删除邮件 */
	public static final Integer SEND_DELETE_DUST = 0;
	public static final Integer SEND_DELETE_PHYSICAL = -2;
	public static final Integer RECEIVE_DELETE_NORMAL = 2;
	public static final Integer RECEIVE_DELETE_DUST = 0;
	public static final Integer RECEIVE_DELETE_PHYSICAL = -2;
	


}
