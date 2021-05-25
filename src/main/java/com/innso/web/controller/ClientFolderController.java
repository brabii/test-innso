package com.innso.web.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innso.exceptions.InvalidClientFolderException;
import com.innso.services.ClientFolderService;
import com.innso.web.model.ClientFolderDto;

@RestController
@RequestMapping("/api/v1/clientFolder")
public class ClientFolderController {

	private final ClientFolderService clientFolderService;

	public ClientFolderController(ClientFolderService clientFolderService) {
		this.clientFolderService = clientFolderService;
	}

	@GetMapping("/")
	public ResponseEntity<List<ClientFolderDto>> allClientFolder() {
		return new ResponseEntity<List<ClientFolderDto>>(clientFolderService.getClientFolders(), HttpStatus.OK);
	}

	@GetMapping({ "/{clientFolderId}" })
	public ResponseEntity<ClientFolderDto> getClientFolder(@PathVariable("clientFolderId") long clientFolderId) {
		ClientFolderDto clientFolderDto = clientFolderService.getClientFolderById(clientFolderId);
		return new ResponseEntity<ClientFolderDto>(clientFolderDto, HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<ClientFolderDto> create(@RequestBody ClientFolderDto clientFolderDto) {
		ClientFolderDto cliDto = null;
		try {
			cliDto = clientFolderService.save(clientFolderDto);
		} catch (InvalidClientFolderException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<ClientFolderDto>(cliDto, HttpStatus.OK);
	}

}
