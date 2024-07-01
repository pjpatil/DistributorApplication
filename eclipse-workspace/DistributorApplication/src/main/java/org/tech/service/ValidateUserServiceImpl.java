package org.tech.service;

import org.tech.model.LoginModel;
import org.tech.repository.ValidateUserRepository;
import org.tech.repository.ValidateUserRepositoryImpl;

public class ValidateUserServiceImpl implements ValidateUserService {

	ValidateUserRepository validRepo = new ValidateUserRepositoryImpl();

	@Override
	public LoginModel isValidateUser(LoginModel model){
		return validRepo.isValidate(model);

	}

}
