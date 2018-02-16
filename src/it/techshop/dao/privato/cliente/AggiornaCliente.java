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
 * Servlet implementation class AggiornaCliente
 */
@WebServlet("/AggiornaCliente")
public class AggiornaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AggiornaCliente() {
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
		String us = request.getParameter("username");
		 String pass = request.getParameter("password");
		 String nom = request.getParameter("nome");
		 String cogn = request.getParameter("cognome");
		 String ind = request.getParameter("indirizzo");
		 String piva = request.getParameter("cf_piva");
		 String tel = request.getParameter("telefono");
		 String em = request.getParameter("email");
		 
		 Cliente cliente = new Cliente(idcl,us,pass,nom,cogn,ind,piva,tel,em);
		 ClienteDAO clientedao = new ClienteDAO();
		 cliente=clientedao.UpdateCliente(cliente);
		// request.setAttribute("cliente", cliente);
		 response.sendRedirect("VisualizzaClienti");
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
