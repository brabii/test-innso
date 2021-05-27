package com.innso.services;

import java.util.List;

import com.innso.exceptions.InvalidClientFolderException;
import com.innso.web.model.ClientFolderDto;

public interface ClientFolderService {

	ClientFolderDto save(ClientFolderDto clientFolderDto) throws InvalidClientFolderException;

	List<ClientFolderDto> getClientFolders();
}
