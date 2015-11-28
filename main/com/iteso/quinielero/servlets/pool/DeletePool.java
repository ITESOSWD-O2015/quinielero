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
import com.iteso.quinielero.quiniela.impl.Quiniela;
import com.iteso.quinielero.users.impl.Profile;
import com.mysql.*;
import com.mysql.jdbc.*;

@WebServlet("/DeletePool")
public class DeletePool extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public DeletePool() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		// Data inserted by the user
		int idQuinielaByUser = Integer.parseInt(request.getParameter("Id_Quiniela_To_Delete"));
		
		// Get the ID of the Quiniela to delete
		String QuinielaNameToDelete =  "SELECT name FROM Quiniela WHERE idQuiniela='" + idQuinielaByUser +"'";
		
		
		String dbInsertion = "";
		try{
			dbInsertion = "DELETE FROM `Quiniela` WHERE idQuiniela = '" + idQuinielaByUser +"'";
			DatabaseConnection.updateStatement(dbInsertion);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.getWriter().println("Your new pool was succesfully saved!");
		response.getWriter().println("Deleted Pool: " + QuinielaNameToDelete);
	}

}
