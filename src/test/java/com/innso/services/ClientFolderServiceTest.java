package com.innso.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.innso.exceptions.InvalidClientFolderException;
import com.innso.web.builder.ClientFolderDtoBuilder;
import com.innso.web.model.ClientFolderDto;

@SpringBootTest
public class ClientFolderServiceTest {
	private static final ClientFolderDto INVALID_CLIENT_FOLDER = null;
	private static final ClientFolderDto CLIENT_FOLDER_TO_SAVE = ClientFolderDtoBuilder.aClientFloderDto().id(1L)
			.name("Jérémie Durand").reference("KA-XXX").messages(new ArrayList<>()).build();

	@Autowired
	private ClientFolderServiceImpl clientFolderService;

	@Test
	public void shouldGetAllClientFolder() {
		assertNotNull(clientFolderService.getClientFolders());
	}

	@Test
	public void shouldThrowExceptionWhenClientFolderNonValid() {
		assertThrows(InvalidClientFolderException.class, () -> {
			clientFolderService.save(INVALID_CLIENT_FOLDER);
		});
	}

	@Test
	public void shouldSaveClientFolder() throws InvalidClientFolderException {
		ClientFolderDto clientFolderDto = clientFolderService.save(CLIENT_FOLDER_TO_SAVE);
		assertTrue(clientFolderDto != null);
	}
}
