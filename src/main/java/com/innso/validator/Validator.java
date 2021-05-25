package com.innso.validator;

import com.innso.services.MessageServiceImpl;

public class Validator extends MessageServiceImpl {

	public static <T> void validate(T dto) throws Exception {
		if (dto == null) {
			throw new Exception("dto non valid.");
		}
	}
}
