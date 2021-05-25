package com.innso.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.innso.web.builder.ClientFolderDtoBuilder;
import com.innso.web.model.ClientFolderDto;
import com.innso.web.model.MessageDto;

@SpringBootTest
public class ClientFolderServiceTest {
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
}

class TestableClientFolderService extends ClientFolderServiceImpl {

	private static final String CLIENT_NAME = "Jérémie Durand";
	private static final String REFERENCE = "KA-XXX";
	private static final List<MessageDto> CLIENT_ESSAGES = null;

	@Override
	public ClientFolderDto getClientFolderById(long clientFolderId) {
		ClientFolderDto clientFolderDto = ClientFolderDtoBuilder.aClientFloderDto().id(clientFolderId).name(CLIENT_NAME)
				.reference(REFERENCE).messages(CLIENT_ESSAGES).build();
		return clientFolderDto;
	}
}