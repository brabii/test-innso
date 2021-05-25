package com.innso.web.model;

import java.util.Date;

public class MessageDto {

	private long messageId;
	private Date messageDate = new Date();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((canal == null) ? 0 : canal.hashCode());
		result = prime * result + ((clientFolder == null) ? 0 : clientFolder.hashCode());
		result = prime * result + ((messageAuthor == null) ? 0 : messageAuthor.hashCode());
		result = prime * result + ((messageContent == null) ? 0 : messageContent.hashCode());
		result = prime * result + ((messageDate == null) ? 0 : messageDate.hashCode());
		result = prime * result + (int) (messageId ^ (messageId >>> 32));
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
		MessageDto other = (MessageDto) obj;
		if (canal != other.canal)
			return false;
		if (clientFolder == null) {
			if (other.clientFolder != null)
				return false;
		} else if (!clientFolder.equals(other.clientFolder))
			return false;
		if (messageAuthor == null) {
			if (other.messageAuthor != null)
				return false;
		} else if (!messageAuthor.equals(other.messageAuthor))
			return false;
		if (messageContent == null) {
			if (other.messageContent != null)
				return false;
		} else if (!messageContent.equals(other.messageContent))
			return false;
		if (messageDate == null) {
			if (other.messageDate != null)
				return false;
		} else if (!messageDate.equals(other.messageDate))
			return false;
		if (messageId != other.messageId)
			return false;
		return true;
	}
}
