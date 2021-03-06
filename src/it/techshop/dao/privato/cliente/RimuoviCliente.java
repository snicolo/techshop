package it.techshop.dao.privato.cliente;

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
 * Servlet implementation class RimuoviCliente
 */
@WebServlet("/RimuoviCliente")
public class RimuoviCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RimuoviCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String idc = request.getParameter("id");
		int idcl = Integer.parseInt(idc);
		Cliente cliente = new Cliente(idcl, "","","","","","","","");
		ClienteDAO clientedao = new ClienteDAO();
		cliente = clientedao.rimuoviCliente(cliente);
		request.getRequestDispatcher("VisualizzaClienti").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
