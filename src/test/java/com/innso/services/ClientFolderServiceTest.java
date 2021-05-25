package com.innso.services;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.innso.exceptions.InvalidClientFolderException;
import com.innso.web.builder.ClientFolderDtoBuilder;
import com.innso.web.model.ClientFolderDto;
import com.innso.web.model.MessageDto;

@SpringBootTest
public class ClientFolderServiceTest {
	private static final ClientFolderDto INVALID_CLIENT_FOLDER = null;
	private ClientFolderServiceImpl clientFolderService = new TestableClientFolderService();

	@Test
	public void shouldThrowExceptionWhenClientNotExists() {
		// TODO
	}

	@ParameterizedTest
	@ValueSource(longs = { 1, 100L, 188L })
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
}

class TestableClientFolderService extends ClientFolderServiceImpl {

	private List<ClientFolderDto> clientFolders = super.getClientFolders();
	private static final String CLIENT_NAME = "Jérémie Durand";
	private static final String REFERENCE = "KA-XXX";
	private static final List<MessageDto> CLIENT_MESSAGES = new ArrayList<>();

	@Override
	public ClientFolderDto getClientFolderById(long clientFolderId) {
		ClientFolderDto clientFolderDto = ClientFolderDtoBuilder.aClientFloderDto().id(clientFolderId).name(CLIENT_NAME)
				.reference(REFERENCE).messages(CLIENT_MESSAGES).build();
		return clientFolderDto;
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

}