package org.tech.repository;

import org.tech.model.LoginModel;

public interface ValidateUserRepository {

	public LoginModel isValidate(LoginModel model);
}
