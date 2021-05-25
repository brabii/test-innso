package com.innso.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.innso.exceptions.InvalidMessageException;
import com.innso.web.model.MessageDto;

@Service
public class MessageServiceImpl implements MessageService {

	Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
	private List<MessageDto> messages = new ArrayList<>();

	@Override
	public MessageDto save(MessageDto messageDto) {
		if (messageDto == null) {
			throw new InvalidMessageException();
		}
		logger.info("{} saved .", messageDto);
		messages.add(messageDto);
		return messageDto;
	}

	@Override
	public List<MessageDto> getMessages() {
		return messages;
	}
}
