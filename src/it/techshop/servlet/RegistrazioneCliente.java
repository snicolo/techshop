package it.techshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.techshop.dao.beans.Cliente;
import it.techshop.dao.beans.ClienteDAO;

/**
 * Servlet implementation class RegistrazioneCliente
 */
@WebServlet("/RegistrazioneCliente")
public class RegistrazioneCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrazioneCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	 String us = request.getParameter("username");
	 String pass = request.getParameter("password");
	 String nom = request.getParameter("nome");
	 String cogn = request.getParameter("cognome");
	 String ind = request.getParameter("indirizzo");
	 String piva = request.getParameter("cf_piva");
	 String tel = request.getParameter("telefono");
	 String em = request.getParameter("email");
	 
	 //inserito trigger su sqldeveloper che incrementa automaticamente l'id del cliente
	 
	 Cliente cliente = new Cliente(0 , us, pass, nom, cogn, ind, piva, tel, em);
	 ClienteDAO clientedao = new ClienteDAO();
	 cliente=clientedao.salvaCliente(cliente);
	 
	 request.setAttribute("cliente", cliente);
	 request.getRequestDispatcher("VisualizzaClienti").forward(request, response);
	}
  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	//}

}
