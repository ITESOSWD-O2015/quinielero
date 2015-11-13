package com.iteso.quinielero.servlets.pool;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CreatePoolServlet
 */
@WebServlet("/LeavePool")
public class LeavePool extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeavePool() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * Problema de diseño: 
		 * cuando se quiere borrar una quiniela, se obtiene su nombre, pero como sabemos a que quiniela se refiere? 
		 * se necesitaria saber la lista de quinielas a las que pertenece el usuario
		 * y no sabemos el usuario con este diseño
		 */
		
		String name_quiniela	  = request.getParameter("id_quiniela");
		response.getWriter().println("You are leaving from " + name_quiniela + " pool");
		
		
	}

}
