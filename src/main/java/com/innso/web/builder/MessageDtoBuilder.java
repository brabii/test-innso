package com.innso.web.builder;

import java.util.Date;

import com.innso.web.model.Canal;
import com.innso.web.model.ClientFolderDto;
import com.innso.web.model.MessageDto;

public class MessageDtoBuilder {

	private long messageId;
	private Date messageDate;
	private String messageAuthor;
	private String messageContent;
	private Canal canal;
	private ClientFolderDto clientFolder;

	public static MessageDtoBuilder aMessageDto() {
		return new MessageDtoBuilder();
	}

	public MessageDtoBuilder id(long messageId) {
		this.messageId = messageId;
		return this;
	}

	public MessageDtoBuilder date(Date date) {
		this.messageDate = date;
		return this;
	}

	public MessageDtoBuilder author(String author) {
		this.messageAuthor = author;
		return this;
	}

	public MessageDtoBuilder message(String content) {
		this.messageContent = content;
		return this;
	}

	public MessageDtoBuilder canal(Canal canal) {
		this.canal = canal;
		return this;
	}

	public MessageDtoBuilder clientFolder(ClientFolderDto clientFolder) {
		this.clientFolder = clientFolder;
		return this;
	}

	public MessageDto build() {
		MessageDto messageDto = new MessageDto();
		messageDto.setMessageId(this.messageId);
		messageDto.setMessageDate(this.messageDate);
		messageDto.setMessageAuthor(this.messageAuthor);
		messageDto.setMessageContent(this.messageContent);
		messageDto.setCanal(this.canal);
		messageDto.setClientFolder(this.clientFolder);
		return messageDto;
	}
}
