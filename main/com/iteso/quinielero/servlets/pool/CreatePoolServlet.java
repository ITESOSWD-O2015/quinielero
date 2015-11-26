package com.iteso.quinielero.servlets.pool;


import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iteso.quinielero.mysql.DatabaseConnection;
import com.iteso.quinielero.quiniela.Quiniela;

import com.iteso.quinielero.users.Profile;
import com.mysql.*;
import com.mysql.jdbc.*;

/**
 * Servlet implementation class CreatePoolServlet
 */
@WebServlet("/CreatePoolServlet")
public class CreatePoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreatePoolServlet() {
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
		
		// Data inserted by the user
		String name = request.getParameter("pool_name");
		String league = request.getParameter("select_league_button");
		int minimum = Integer.parseInt(request.getParameter("minimum_participants"));
		int maximum = Integer.parseInt(request.getParameter("maximum_participants"));
		float price = Float.parseFloat(request.getParameter("pool_price"));
		String date = request.getParameter("start_date");
		String mode = request.getParameter("select_pool_mode_button");
		int idUser = Integer.parseInt(request.getParameter("user_id"));
		
		//Get the ID of the league
		String query = "SELECT idQuinielaType FROM QuinielaType WHERE name='" + mode +"'";
		int idMode = -1;
		try{
			ResultSet rs = DatabaseConnection.queryStatement(query);
			rs.next();
			idMode = rs.getInt("idQuinielaType");
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Quiniela quiniela = new Quiniela(name);

		quiniela.setLeague(league);
		quiniela.setMinimum_participants(minimum);
		quiniela.setMaximum_participants(maximum);
		quiniela.setPools_price(price);
		quiniela.setStart_date(date);
		quiniela.setPoolMode(request.getParameter("select_pool_mode_button"));

		
		try {			
			
			DatabaseConnection.updateStatement("INSERT INTO Quiniela (name, idliga, idCreator, minParticipant, maxParticipant, begin, price, idTipoQuiniela) VALUES ('" + quiniela.getName() + "', '1', '1', '"
					+ quiniela.getMinimum_participants() + "', '" + quiniela.getMaximum_participants() + "', '2015-01-15', '" + quiniela.getPools_price() + "', '" + quiniela.getPoolMode()
					+ "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.getWriter().println("Your new pool was succesfully saved!");
		response.getWriter().println("Minimum Participants: " + quiniela.getMinimum_participants());
		response.getWriter().println("Maximum Participants: " + quiniela.getMaximum_participants());
		response.getWriter().println("Pool's price: " + quiniela.getPools_price());
		response.getWriter().println("Start date: " + quiniela.getStart_date());
		response.getWriter().println("The ID of the pool creator is: " + idUser);
		response.getWriter().println("League Selected: " + quiniela.getLeague());
		response.getWriter().println("You have successfully created a " + quiniela.getPoolMode() + " mode quiniela");
		response.getWriter().println("This type of pool has the id:  " + idMode);

	}

}
