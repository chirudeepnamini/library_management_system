package com.dxc;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firstservlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.getWriter().println("hello");
		ServletContext ctxt=getServletContext();
		String ph=ctxt.getInitParameter("mobilebrand");
		response.getWriter().println(ph);
		ServletConfig cg=getServletConfig();
		String phone =cg.getInitParameter("phone");
		response.getWriter().println(phone);
		
	}
	

}
