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

@WebServlet("/InvitePeople")
public class InvitePeople extends HttpServlet{

	public InvitePeople(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		// Data inserted by the user
		int idQuinielaToInvite = Integer.parseInt(request.getParameter("IdQuinielaToInvite"));
		String   User_email = request.getParameter("participant");
		
		//Get the name of the Quiniela
		String queryQuinielaName = " SELECT `name` FROM `Quiniela` WHERE `idQuiniela` = '" + idQuinielaToInvite +"'";
		String queryEmailUser = " SELECT `idUser` FROM `User` WHERE `username` =  '" + User_email +"'";
		
		String dbInsertion = "";
		String dbValuesToInsert = "";
		String dbValueID = "";
		int iduser = 0;
		try {
			ResultSet rs = DatabaseConnection.queryStatement(queryEmailUser);
			rs.next();
			iduser = rs.getInt("iduser");
		}catch(SQLException e){
			// TODO Auto-generated catch block
						e.printStackTrace();
		}
		
		try{
			dbValuesToInsert = "'" + idQuinielaToInvite + "','" + iduser + "'";
			dbInsertion = "INSERT INTO `UserQuiniela`(`idUserQuiniela`, `idQuiniela`, `idUser`) VALUES (" + dbValuesToInsert + ")";
			DatabaseConnection.updateStatement(dbInsertion);
		}catch(SQLException e){
			// TODO Auto-generated catch block
						e.printStackTrace();
		}
	}
}






