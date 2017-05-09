package it.euris.example.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.euris.example.models.User;

@WebServlet(
		  name = "myServlet",
		  urlPatterns = {"/ciao", "/hello"},
		  loadOnStartup = 1
		)
public class MyServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		User armando = new User("Armando", "Donzelli", 64);
		request.setAttribute("armando", armando);
		request.getRequestDispatcher("/WEB-INF/views/hidden.jsp").forward(request,response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		this.doGet(request, response);
	}

}
