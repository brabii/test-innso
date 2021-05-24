package com.innso.services;

import com.innso.web.model.MessageDto;

public interface MessageService {

	MessageDto getMessageById(long messageId);

	MessageDto save(MessageDto messageDto);

}
