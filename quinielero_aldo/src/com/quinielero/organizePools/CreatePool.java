package com.quinielero.organizePools;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import com.quinielero.organizePools.Quiniela;

/**
 * Servlet implementation class CreatePool
 */
@WebServlet("/CreatePool")
public class CreatePool extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePool() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name   = request.getParameter("pool_name");
		String league = request.getParameter("select_league_button");
		int minimum	  = Integer.parseInt(request.getParameter("minimum_participants"));
		int maximum   = Integer.parseInt(request.getParameter("maximum_participants"));
		float price   = Float.parseFloat(request.getParameter("pool_price"));
		String date   = request.getParameter("start_date");
		
		
		response.getWriter().println("Datos eviados por el usuario: ");
		response.getWriter().println("Pool's name: "+ name);
		response.getWriter().println("League Selected: " + league);
		response.getWriter().println("Minimum Participants: " + minimum);
		response.getWriter().println("Maximum Participants: " + maximum);
		response.getWriter().println("Pool's price: " + price);
		response.getWriter().println("Start date: " + date);
		
		
		Quiniela quiniela = new Quiniela(name);
		
		
		
		quiniela.setLeague(league);
		quiniela.setParticipants(minimum, maximum);
		quiniela.setPools_price(price);		
		quiniela.setStart_date(date);
		
		response.getWriter().println();
		response.getWriter().println();
		response.getWriter().println("Datos guardados en la quiniela: ");
		response.getWriter().println("Pool's name: " + quiniela.getName());
		response.getWriter().println("League Selected: " + quiniela.getLeague());
		response.getWriter().println("Minimum Participants: " + quiniela.getMinimum_participants());
		response.getWriter().println("Maximum Participants: " + quiniela.getMaximum_participants());
		response.getWriter().println("Pool's price: " + quiniela.getPools_price());
		response.getWriter().println("Start date: " + quiniela.getStart_date());
		
		
		
		
	}

}
