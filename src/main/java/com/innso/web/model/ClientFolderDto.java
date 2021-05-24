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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (clientFolderId ^ (clientFolderId >>> 32));
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + ((messages == null) ? 0 : messages.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientFolderDto other = (ClientFolderDto) obj;
		if (clientFolderId != other.clientFolderId)
			return false;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (messages == null) {
			if (other.messages != null)
				return false;
		} else if (!messages.equals(other.messages))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}
}
