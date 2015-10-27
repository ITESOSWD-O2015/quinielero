package com.quinielero.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import com.quinielero.profile.ProfileUser;

=======
>>>>>>> b9b3c3d1b318878b32aa6ead7a48a353889fe9ee
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginWeb.jr")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String password = request.getParameter("password");
<<<<<<< HEAD
		if (user.equals("Geovani") && password.equals("Serrano")) {
			ProfileUser profileUser = new ProfileUser();
			profileUser.setFirstName(user);
			profileUser.setLastName(password);
			profileUser.setStreet1("Monte Blanco 282");
			profileUser.setStreet2("");
			profileUser.setCity("Guadalajara");
			profileUser.setState("Jalisco");
			profileUser.setCountry("México");
			profileUser.setZip("44340");
			profileUser.setNickName("Wolf Blood Dude");
			profileUser.setMemberSince("20 de octubre de 2015");
			profileUser.setPhoneNumber("(33) 1023 1780");
			request.setAttribute("profileUser", profileUser);
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		} else {
			System.out.println("Error al ingresar");
			response.sendRedirect("login.html");
		}
=======
		
		System.out.println("Welcome " + user + " " + password);
>>>>>>> b9b3c3d1b318878b32aa6ead7a48a353889fe9ee
	}

}
