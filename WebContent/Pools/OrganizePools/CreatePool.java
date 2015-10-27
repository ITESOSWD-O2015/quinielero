package com.quinielero.organizePools;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.quinielero.organizePools.Quiniela;

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
		
		Quiniela quiniela = new Quiniela();
		
		quiniela.setLeague(request.getParameter("select_league_button"));
		quiniela.setMinimum_participants(Integer.parseInt(request.getParameter("minimum_participants")));
		quiniela.setMaximum_participants(Integer.parseInt(request.getParameter("maximum_participants")));
		String tempPrice = request.getParameter("pool_price_integer") + "." + request.getParameter("pool_price_deicmal");		
		quiniela.setPools_price(Float.parseFloat(tempPrice));		
		quiniela.setStart_date(request.getParameter("sart_date"));
		
		response.getWriter().println("League Selected: " + quiniela.getLeague());
		response.getWriter().println("Minimum Participants: " + quiniela.getMinimum_participants());
		response.getWriter().println("Maximum Participants: " + quiniela.getMaximum_participants());
		response.getWriter().println("Pool's price: " + quiniela.getPools_price());
		response.getWriter().println("Start date: " + quiniela.getStart_date());
	}

}
