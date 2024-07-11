package org.tech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.tech.model.VendorModel;
import org.tech.service.*;

@WebServlet("/searchVendor")
public class SearchVendorController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("n");
		VendorService vendorService = new VendorServiceImpl(); 
		List<VendorModel> list=vendorService.getvendorListByName(name);
		out.println("<table class=\"table table-hover\">");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th scope=\"col\">ID</th>");
		out.println("<th scope=\"col\">NAME</th>");
		out.println("<th scope=\"col\">DELETE</th>");
		out.println("<th scope=\"col\">UPDATE</th>");
		out.println("</tr>");
		out.println("</thead>");	
		out.println("</tbody>");	
		for(VendorModel v:list) {
			out.println("<tr>");
			out.println("<td scope=\"col\">"+v.getId()+"</td>");
			out.println("<td scope=\"col\">"+v.getName()+"</td>");
			out.println("<td scope=\"col\"><a href='delvendor?vid="+v.getId()+"'>DELETE</a></td>");
			out.println("<td scope=\"col\"><a href=''>UPDATE</a></td>");
			out.println("</tr>");
			
			
			
		}
		out.println("</tbody>");	
		out.println("</table>");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
