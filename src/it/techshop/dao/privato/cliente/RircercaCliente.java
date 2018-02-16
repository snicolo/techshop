package it.techshop.dao.privato.cliente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.techshop.dao.beans.Cliente;
import it.techshop.dao.beans.ClienteDAO;

/**
 * Servlet implementation class RircercaCliente
 */
@WebServlet("/RircercaCliente")
public class RircercaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RircercaCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getParameter("username");
		String us = request.getParameter("username");
		Cliente cliente = new Cliente (0,us,"","","","","","","");
		ClienteDAO clientedao = new ClienteDAO();
		cliente = clientedao.RicercaCliente(cliente);
		
		request.setAttribute("cliente", cliente);
		request.getRequestDispatcher("adminarea/visualizzacliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
