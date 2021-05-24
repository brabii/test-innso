package com.innso.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innso.services.MessageService;
import com.innso.web.model.MessageDto;

@RestController
@RequestMapping("/api/v1/message")
public class MessageController {

	private final MessageService messageService;

	public MessageController(MessageService messageService) {
		this.messageService = messageService;
	}

	@GetMapping({ "/{messageId}" })
	public ResponseEntity<MessageDto> getMessage(@PathVariable("messageId") long messageId) {
		MessageDto messageDto = messageService.getMessageById(messageId);
		return new ResponseEntity<MessageDto>(messageDto, HttpStatus.OK);
	}
}