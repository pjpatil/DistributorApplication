package org.tech.repository;

import org.tech.model.LoginModel;

public class ValidateUserRepositoryImpl extends DBParent implements ValidateUserRepository {

	@Override
	public LoginModel isValidate(LoginModel model) {
		try {
			stmt=conn.prepareStatement("select *from login where username=? and password=? ");
			stmt.setString(1, model.getUsername());
			stmt.setString(2,model.getPassword());
			rs=stmt.executeQuery();
			if(rs.next()) {
				model.setLoginType(rs.getString("logintype"));
			}
			return model;
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
			return null;
		}
	}
	
	public static void main(String x[] ){
		ValidateUserRepositoryImpl vreimpl= new ValidateUserRepositoryImpl();
		LoginModel model=new LoginModel();
		model.setUsername("abc");
		model.setPassword("abc");
		model=vreimpl.isValidate(model);
		System.out.println(model);
		
	}

}
