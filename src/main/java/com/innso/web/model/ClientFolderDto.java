package com.innso.web.model;

import java.util.List;

public class ClientFolderDto {

	private long clientFolderId;
	private String clientName;
	private String reference;
	private List<MessageDto> messages;

	public ClientFolderDto() {
	}

	public long getClientFolderId() {
		return clientFolderId;
	}

	public void setClientFolderId(long clientFolderId) {
		this.clientFolderId = clientFolderId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public List<MessageDto> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageDto> messages) {
		this.messages = messages;
	}

}
