package it.techshop.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.techshop.dao.news.News;
import it.techshop.dao.news.NewsDAO;

/**
 * Servlet implementation class ListaNews
 */
@WebServlet("/ListaNews")
public class ListaNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaNews() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		NewsDAO listanewsdao = new NewsDAO();
		Vector<News> listanews = listanewsdao.getListaNews();
		request.setAttribute("listanews", listanews);
		String action = request.getParameter("action");
		
		//inseriamo un controllo per sfruttare la stessa servlet per visualizzare le 
		//news come amministratore o come visitatore
		
		if (action.equals("admin")) {
			
			request.getRequestDispatcher("adminarea/newslist.jsp").forward(request, response);
		}
		else {if (action.equals("user")) {
			
			request.getRequestDispatcher("news.jsp").forward(request, response);
			
		}}
	}

	

}
