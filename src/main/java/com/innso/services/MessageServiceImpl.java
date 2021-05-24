package com.innso.services;

import org.springframework.stereotype.Service;

import com.innso.web.builder.MessageDtoBuilder;
import com.innso.web.model.MessageDto;

@Service
public class MessageServiceImpl implements MessageService {

	@Override
	public MessageDto getMessageById(long messageId) {
		return MessageDtoBuilder.aMessageDto()
								.id(messageId)
								.date(null).author("Jérémie Durand")
								.message("Bonjour j'ai un probléme avec mon nouveau téléphone")
								.canal(null)
								.clientFolder(null)
								.build();
	}
}
