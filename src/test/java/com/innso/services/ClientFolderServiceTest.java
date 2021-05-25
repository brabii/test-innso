package com.innso.services;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.innso.exceptions.ClientFolderNotFoundException;
import com.innso.exceptions.InvalidClientFolderException;
import com.innso.web.builder.ClientFolderDtoBuilder;
import com.innso.web.model.ClientFolderDto;
import com.innso.web.model.MessageDto;

@SpringBootTest
public class ClientFolderServiceTest {
	private static final ClientFolderDto INVALID_CLIENT_FOLDER = null;
	private static final ClientFolderDto CLIENT_FOLDER_TO_SAVE = ClientFolderDtoBuilder.aClientFloderDto().id(1L)
			.name("Jérémie Durand").reference("KA-XXX").messages(new ArrayList<>()).build();
	private ClientFolderServiceImpl clientFolderService = new TestableClientFolderService();

	@ParameterizedTest
	@ValueSource(longs = { 150L })
	public void shouldThrowExceptionWhenClientFolderNotExists(long clientFolderId) {
		assertThrows(ClientFolderNotFoundException.class, () -> {
			clientFolderService.getClientFolderById(clientFolderId);
		});
	}

	@ParameterizedTest
	@ValueSource(longs = { 1L })
	public void shouldGetClientFolder(long clientFolderId) throws Exception {
		ClientFolderDto clientFolderDto = clientFolderService.getClientFolderById(clientFolderId);
		assertTrue(clientFolderDto != null);
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

class TestableClientFolderService extends ClientFolderServiceImpl {

	private List<ClientFolderDto> clientFolders = initialise();
	private static final String CLIENT_NAME = "Jérémie Durand";
	private static final String REFERENCE = "KA-XXX";
	private static final List<MessageDto> CLIENT_MESSAGES = new ArrayList<>();

	@Override
	public ClientFolderDto getClientFolderById(long clientFolderId) {
		for (ClientFolderDto clientFolderDto : clientFolders) {
			if (clientFolderDto.getClientFolderId() == clientFolderId) {
				return clientFolderDto;
			}
		}
		throw new ClientFolderNotFoundException();
	}

	@Override
	public ClientFolderDto save(ClientFolderDto clientFolderDto) throws InvalidClientFolderException {
		validate(clientFolderDto);
		clientFolders.add(clientFolderDto);
		return clientFolderDto;
	}

	private void validate(ClientFolderDto clientFolderToSave) throws InvalidClientFolderException {
		if (clientFolderToSave == null) {
			throw new InvalidClientFolderException();
		}
	}

	private List<ClientFolderDto> initialise() {
		clientFolders = new ArrayList<>();
		clientFolders.add(ClientFolderDtoBuilder.aClientFloderDto().id(1L).name(CLIENT_NAME).reference(REFERENCE)
				.messages(CLIENT_MESSAGES).build());
		return clientFolders;
	}

}