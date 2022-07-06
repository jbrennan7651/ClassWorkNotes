package com.ust.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyWebExample", value = "/MyWebExample")
public class MyWebExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( "<html><body>");
        out.println( "<h1>GET</h1>");
        out.println( "<form action='MyWebExample' method='POST'>");
        out.println( "Enter a letter <input type='text' name='letter' />");
        out.println( "<input type='submit' /></form>");
        out.println( "</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println( "<html><body>");
        out.println( "<h1>POST</h1>");
        String letterS = request.getParameter( "letter");
        out.println( "Your letter is " + letterS);
        out.println( "</body></html>");
    }
}

