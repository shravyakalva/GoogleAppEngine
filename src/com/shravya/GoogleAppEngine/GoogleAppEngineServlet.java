package com.shravya.GoogleAppEngine;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GoogleAppEngineServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		//resp.getWriter().println("Hello, world");
		PrintWriter pw = resp.getWriter();
		  Date today = new Date();
		  pw.println("Date and time are");
		  pw.println(today);
	}
}
