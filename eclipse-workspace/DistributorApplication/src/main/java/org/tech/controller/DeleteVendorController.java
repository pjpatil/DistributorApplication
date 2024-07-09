package org.tech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.tech.service.*;
@WebServlet("/delvendor")
public class DeleteVendorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int vendorId=Integer.parseInt(request.getParameter("vid"));
		VendorService vendorService = new VendorServiceImpl();
		boolean b=vendorService.isDeleteVendorById(vendorId);
		if(b) {
			RequestDispatcher r =request.getRequestDispatcher("superadmindashboard.jsp");
			r.include(request, response);
			out.println("<h1>Vender delete successfully....</h1>");
		}
		else {
			out.println("<h1>Some problem for delete vendor....</h1>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
