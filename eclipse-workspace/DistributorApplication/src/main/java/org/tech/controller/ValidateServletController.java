package org.tech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tech.model.LoginModel;
import org.tech.repository.DBConfig;
import org.tech.repository.DBParent;
import org.tech.service.ValidateUserService;
import org.tech.service.ValidateUserServiceImpl;

@WebServlet("/valid")
public class ValidateServletController extends HttpServlet {

//	public void init(ServletConfig config) {
//		String path=this.getServletContext().getRealPath("/")+"resources\\db.properties";
//		DBConfig dbConfig=DBConfig.getInstance(path);
//	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String path=request.getServletContext().getRealPath("/")+"resources\\db.properties";
//		DBConfig dbConfig=DBConfig.getInstance(path);
		DBParent.path=path;
		
		String username=request.getParameter("username");
		String password = request.getParameter("password");

		LoginModel model = new LoginModel();
		model.setUsername(username);
		model.setPassword(password);

		ValidateUserService validService = new ValidateUserServiceImpl();
		model = validService.isValidateUser(model);
		out.println(model);
		
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
