package com.iteso.quinielero.servlets.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iteso.quinielero.users.Profile;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("gserrano") && password.equals("1234")) {
			Profile profile = new Profile();
			profile.setFirstName("Geovani");
			profile.setLastName("Serrano");
			profile.setUsername("gserrano");
			profile.setStreet1("Monte Blanco 282");
			profile.setStreet2("");
			profile.setCity("Guadalajara");
			profile.setState("Jalisco");
			profile.setCountry("México");
			profile.setZip("44340");
			profile.setPhone("(33) 1023 1780");
			profile.setMemberSince("November 1, 2015");
			profile.setNickname("Wolf Blood Dude");
			request.setAttribute("loginUser", profile);
			request.getRequestDispatcher("profile/profile.jsp").forward(request, response);
		} else {
			System.out.println("Login error");
			response.sendRedirect("index.jsp");
		}
	}

}
