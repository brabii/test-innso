package com.innso.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.innso.web.builder.MessageDtoBuilder;
import com.innso.web.model.MessageDto;

@Service
public class MessageServiceImpl implements MessageService {

	private List<MessageDto> messages = new ArrayList<>();

	@Override
	public MessageDto save(MessageDto messageDto) {
		messages.add(messageDto);
		return messageDto;
	}

	@Override
	public MessageDto getMessageById(long messageId) {
		return MessageDtoBuilder.aMessageDto().id(messageId).date(null).author("Jérémie Durand")
				.message("Bonjour j'ai un probléme avec mon nouveau téléphone").canal(null).clientFolder(null).build();
	}

	@Override
	public List<MessageDto> getMessages() {
		return messages;
	}
}
