package com.innso.web.builder;

import java.util.List;

import com.innso.web.model.ClientFolderDto;
import com.innso.web.model.MessageDto;

public class ClientFolderDtoBuilder {

	private long clientFolderId;
	private String clientName;
	private String reference;
	private List<MessageDto> messages;

	public static ClientFolderDtoBuilder aClientFloderDto() {
		return new ClientFolderDtoBuilder();
	}

	public ClientFolderDtoBuilder id(long clientFolderId) {
		this.clientFolderId = clientFolderId;
		return this;
	}

	public ClientFolderDtoBuilder name(String clientName) {
		this.clientName = clientName;
		return this;
	}

	public ClientFolderDtoBuilder reference(String reference) {
		this.reference = reference;
		return this;
	}

	public ClientFolderDtoBuilder messages(List<MessageDto> messages) {
		this.messages = messages;
		return this;
	}

	public ClientFolderDto build() {
		ClientFolderDto clientFolderDto = new ClientFolderDto();
		clientFolderDto.setClientFolderId(this.clientFolderId);
		clientFolderDto.setClientName(this.clientName);
		clientFolderDto.setReference(this.reference);
		clientFolderDto.setMessages(this.messages);
		return clientFolderDto;
	}
}
