package com.innso.services;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.innso.exceptions.InvalidMessageException;
import com.innso.validator.MessageServiceValidator;
import com.innso.web.builder.MessageDtoBuilder;
import com.innso.web.model.MessageDto;

@SpringBootTest
public class MessageServiceTest {

	private static final MessageDto MESSAGE_TO_SAVE = MessageDtoBuilder.aMessageDto().id(1L).date(null)
			.author("Jérémie Durand").message("Bonjour j'ai un probléme avec mon nouveau téléphone").canal(null)
			.clientFolder(null).build();
	private static final MessageDto INVALID_MESSAGE = null;
	private static MessageServiceValidator messageService;

	@BeforeAll
	public static void initialise() {
		messageService = new MessageServiceValidator();
	}

	@Test
	public void shouldSaveMessage() throws Exception {
		messageService.validate(MESSAGE_TO_SAVE);
		messageService.save(MESSAGE_TO_SAVE);
		assertTrue(messageService.getMessages().contains(MESSAGE_TO_SAVE));
	}

	@Test
	public void shouldThrowExceptionWhenMessageNotValid() {
		assertThrows(InvalidMessageException.class, () -> {
			messageService.validate(INVALID_MESSAGE);
		});
	}
}
