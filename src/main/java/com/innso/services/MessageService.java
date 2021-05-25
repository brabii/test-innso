package com.innso.services;

import java.util.List;

import com.innso.exceptions.InvalidMessageException;
import com.innso.web.model.MessageDto;

public interface MessageService {

	MessageDto save(MessageDto messageDto) throws InvalidMessageException;

	List<MessageDto> getMessages();

}
