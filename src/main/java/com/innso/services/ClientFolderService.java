package com.innso.services;

import java.util.List;

import com.innso.web.model.ClientFolderDto;

public interface ClientFolderService {

	ClientFolderDto getClientFolderById(long clientFolderId);

	ClientFolderDto save(ClientFolderDto clientFolderDto);

	List<ClientFolderDto> getClientFolders();
}
