package com.iteso.quinielero.servlets.user;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iteso.quinielero.mysql.DatabaseConnection;
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
		Profile profile = new Profile();
		try {
			resultSet = DatabaseConnection.queryStatement("SELECT * FROM User WHERe username = '" + username + "' AND password = '" + password + "'");
			if (resultSet.next()) {
				do {
					profile.setId(resultSet.getString("idUser"));
					profile.setFirstName(resultSet.getString("firstName"));
					profile.setLastName(resultSet.getString("lastName"));
					profile.setUsername(resultSet.getString("username"));
					profile.setStreet1(resultSet.getString("street1"));
					profile.setStreet2(resultSet.getString("street2"));
					profile.setCity(resultSet.getString("city"));
					profile.setState(resultSet.getString("state"));
					profile.setCountry(resultSet.getString("country"));
					profile.setZip(resultSet.getString("zip"));
					profile.setPhone(resultSet.getString("phone"));
					profile.setMemberSince(resultSet.getString("membersince"));
					profile.setNickname(resultSet.getString("nickname"));
				} while (resultSet.next());
				request.setAttribute("loginUser", profile);
				request.getRequestDispatcher("profile/profile.jsp").forward(request, response);
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
