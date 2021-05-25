package com.innso.services;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.innso.exceptions.InvalidMessageException;
import com.innso.web.builder.MessageDtoBuilder;
import com.innso.web.model.Canal;
import com.innso.web.model.MessageDto;

@SpringBootTest
public class MessageServiceTest {

	@Autowired
	private MessageService messageService;

	private static final MessageDto MESSAGE_TO_SAVE = MessageDtoBuilder.aMessageDto().id(1L).date(null)
			.author("Jérémie Durand").message("Bonjour j'ai un probléme avec mon nouveau téléphone").canal(Canal.SMS)
			.clientFolder(null).build();
	private static final MessageDto INVALID_MESSAGE = null;

	@Test
	public void shouldThrowExceptionWhenMessageNotValid() {
		assertThrows(InvalidMessageException.class, () -> {
			messageService.save(INVALID_MESSAGE);
		});
	}

	@Test
	public void shouldSaveMessage() throws Exception {
		messageService.save(MESSAGE_TO_SAVE);
		assertTrue(messageService.getMessages().contains(MESSAGE_TO_SAVE));
	}

}
