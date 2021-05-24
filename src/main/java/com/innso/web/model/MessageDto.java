package com.innso.web.model;

import java.util.Date;

public class MessageDto {

	private long messageId;
	private Date messageDate;
	private String messageAuthor;
	private String messageContent;
	private Canal canal;
	private ClientFolderDto clientFolder;

	public MessageDto() {
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public Date getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	public String getMessageAuthor() {
		return messageAuthor;
	}

	public void setMessageAuthor(String messageAuthor) {
		this.messageAuthor = messageAuthor;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public ClientFolderDto getClientFolder() {
		return clientFolder;
	}

	public void setClientFolder(ClientFolderDto clientFolder) {
		this.clientFolder = clientFolder;
	}
}
