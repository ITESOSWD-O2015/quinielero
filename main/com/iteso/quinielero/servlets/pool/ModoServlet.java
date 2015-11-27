package com.iteso.quinielero.servlets.pool;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iteso.quinielero.quiniela.Quiniela;

/**
 * Servlet implementation class CreatePoolServlet
 */
@WebServlet("/ModoServlet")
public class ModoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name = "";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Quiniela quiniela = new Quiniela(name);
		quiniela.setPoolMode(request.getParameter("select_pool_mode_button"));
		response.getWriter().println("You have successfully created a " + quiniela.getPoolMode() + " mode quiniela");
	}

}
