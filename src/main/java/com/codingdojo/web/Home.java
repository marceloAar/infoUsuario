//Marcelo Aceituno R
//Full Stack JAVA 0034
//Información de Usuario 
package com.codingdojo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 		
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido"); 
        String lenguaje = request.getParameter("lenguaje");
        String ciudad = request.getParameter("ciudad");
        
        response.setContentType("text/html");        
        PrintWriter out = response.getWriter(); 
       
        if (nombre == null) {
        	nombre = "Unknow";
        }else if (apellido == null) { 
            apellido = "Unknow";
        }else if (lenguaje == null) {
            lenguaje = "Unknow";
        }else if (ciudad == null) {
        	ciudad= "Unknow";
        }
        
        out.write("<h1>Bienvenido, " + nombre + " " + apellido + "</h1>");
        out.write("<h1>Your favorite lenguage is: " + lenguaje + "</h1>");
        out.write("<h1>Your Hometown is: " + ciudad + "</h1>");
    }
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);	
		
	}

}
