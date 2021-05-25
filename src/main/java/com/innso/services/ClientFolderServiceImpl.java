package com.innso.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.innso.exceptions.InvalidClientFolderException;
import com.innso.web.model.ClientFolderDto;

@Service
public class ClientFolderServiceImpl implements ClientFolderService {

	private List<ClientFolderDto> clientFolders = new ArrayList<>();

	@Override
	public ClientFolderDto getClientFolderById(long clientFolderId) {
		return null;
	}

	@Override
	public ClientFolderDto save(ClientFolderDto clientFolderDto)  throws InvalidClientFolderException{
		return null;
	}

	@Override
	public List<ClientFolderDto> getClientFolders() {
		return clientFolders;
	}

}
