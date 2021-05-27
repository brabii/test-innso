package com.innso.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/")
	public ResponseEntity<MessageDto> create(@RequestBody MessageDto messageDto) {
		MessageDto msgDto = messageService.save(messageDto);
		return new ResponseEntity<MessageDto>(msgDto, HttpStatus.CREATED);
	}

}
