package com.iteso.quinielero.servlets.user;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iteso.quinielero.mysql.DatabaseConnection;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ResultSet resultSet = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			resultSet = DatabaseConnection.queryStatement("SELECT * FROM User WHERE username = '" + username + "' AND password = '" + password + "'");
			if (resultSet != null) {
				do {
					HttpSession session = request.getSession();
					session.setAttribute("idUser", resultSet.getString("idUser"));
					session.setMaxInactiveInterval(24 * 60 * 60);
				
					Cookie idUser = new Cookie("idUser", resultSet.getString("idUser"));
					idUser.setMaxAge(24 * 60 * 60);
					response.addCookie(idUser);
				} while (resultSet.next());
				response.sendRedirect("profile/profile.jsp");
			} else {
				System.out.println("Login error");
				response.sendRedirect("index.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
