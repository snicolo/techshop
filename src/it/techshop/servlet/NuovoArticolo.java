package it.techshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.techshop.dao.beans.Cliente;
import it.techshop.dao.beans.ClienteDAO;
import it.techshop.dao.news.News;
import it.techshop.dao.news.NewsDAO;

/**
 * Servlet implementation class NuovoArticolo
 */
@WebServlet("/NuovoArticolo")
public class NuovoArticolo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NuovoArticolo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String idn = request.getParameter("id");
		 String tit = request.getParameter("title");
		 String des = request.getParameter("desc");
		 
		 News news = new News (idn, null, tit,des);
		 NewsDAO newsdao = new NewsDAO();
		 news=newsdao.inserisciNews(news);
		 
		 request.getRequestDispatcher("ListaNews?action=admin").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
