package it.techshop.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.techshop.dao.ordine.ListaOrdiniQuery;
import it.techshop.dao.ordine.ListaOrdiniQueryDAO;

/**
 * Servlet implementation class ListaOrdini
 */
@WebServlet("/ListaOrdini")
public class ListaOrdini extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaOrdini() {
        super();
        // TODO Auto-generated constructor stub
    } 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ListaOrdiniQueryDAO listaordinidao = new ListaOrdiniQueryDAO();
		Vector<ListaOrdiniQuery> listaordini = listaordinidao.getListaOrdiniDetail();
		
		request.setAttribute("listaordini", listaordini);
		request.getRequestDispatcher("adminarea/orderlist.jsp").forward(request, response);
	}

}
