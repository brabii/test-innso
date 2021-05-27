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
	public ClientFolderDto save(ClientFolderDto clientFolderDto) throws InvalidClientFolderException {
		if (clientFolderDto == null) {
			throw new InvalidClientFolderException();
		}
		clientFolderDto.equals(clientFolderDto);
		return clientFolderDto;
	}

	@Override
	public List<ClientFolderDto> getClientFolders() {
		return clientFolders;
	}

}
