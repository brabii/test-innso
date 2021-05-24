package com.innso.validator;

import com.innso.exceptions.InvalidMessageException;
import com.innso.services.MessageServiceImpl;
import com.innso.web.model.MessageDto;

public class MessageServiceValidator extends MessageServiceImpl {

	public void validate(MessageDto messageDto) throws InvalidMessageException {
		if (messageDto == null || messageDto.getMessageId() < 0) {
			throw new InvalidMessageException();
		}
	}
}
