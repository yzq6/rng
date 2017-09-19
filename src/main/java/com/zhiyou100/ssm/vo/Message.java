package com.zhiyou100.ssm.vo;

import java.io.Serializable;

import java.util.Date;

@SuppressWarnings("serial")
public class Message implements Serializable {
	
	private int messageId;
	private String subject;
	private String content;
	private int sender;
	private String senderName;
	private int sendDelete;
	private int sendStatus;
	private Date saveTime;
	private Date sendTime;
	private Date sendUpdateTime;
	private int receiver;
	private String receiverName;
	private int receiveDelete;
	private int receiveStatus;
	private Date receiveUpdateTime;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public int getSendDelete() {
		return sendDelete;
	}
	public void setSendDelete(int sendDelete) {
		this.sendDelete = sendDelete;
	}
	public int getSendStatus() {
		return sendStatus;
	}
	public void setSendStatus(int sendStatus) {
		this.sendStatus = sendStatus;
	}
	public Date getSaveTime() {
		return saveTime;
	}
	public void setSaveTime(Date saveTime) {
		this.saveTime = saveTime;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public Date getSendUpdateTime() {
		return sendUpdateTime;
	}
	public void setSendUpdateTime(Date sendUpdateTime) {
		this.sendUpdateTime = sendUpdateTime;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public int getReceiveDelete() {
		return receiveDelete;
	}
	public void setReceiveDelete(int receiveDelete) {
		this.receiveDelete = receiveDelete;
	}
	public int getReceiveStatus() {
		return receiveStatus;
	}
	public void setReceiveStatus(int receiveStatus) {
		this.receiveStatus = receiveStatus;
	}
	public Date getReceiveUpdateTime() {
		return receiveUpdateTime;
	}
	public void setReceiveUpdateTime(Date receiveUpdateTime) {
		this.receiveUpdateTime = receiveUpdateTime;
	}
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", subject=" + subject + ", content=" + content + ", sender="
				+ sender + ", senderName=" + senderName + ", sendDelete=" + sendDelete + ", sendStatus=" + sendStatus
				+ ", saveTime=" + saveTime + ", sendTime=" + sendTime + ", sendUpdateTime=" + sendUpdateTime
				+ ", receiver=" + receiver + ", receiverName=" + receiverName + ", receiveDelete=" + receiveDelete
				+ ", receiveStatus=" + receiveStatus + ", receiveUpdateTime=" + receiveUpdateTime + "]";
	}
	
}
