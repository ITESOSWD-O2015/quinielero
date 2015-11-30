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

/**
 * Servlet implementation class InvitePeople
 */
@WebServlet("/InvitePeople")
public class InvitePeople extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvitePeople() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Data inserted by the user
		int idQuinielaToInvite = Integer.parseInt(request.getParameter("IdQuinielaToInvite"));
		String User_email = request.getParameter("participant");
		
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
