package org.tech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tech.model.VendorModel;
import org.tech.service.*;

@WebServlet("/savevendor")
public class VendorCotroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String vendName=request.getParameter("name");
//		out.println("<h1>Vender name is "+vendName+"</h1>");
		VendorModel vmodel=new VendorModel();
		vmodel.setName(vendName);
		VendorService vendorService=new VendorServiceImpl();
		boolean b=vendorService.isAddNewVendor(vmodel);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("superadmindashboard.jsp");
			r.include(request, response);
		}
		else {
			out.println("<h1>Vendor not added Successfully... </h1>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
