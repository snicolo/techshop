package it.techshop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.techshop.dao.beans.Admin;
import it.techshop.dao.beans.AdminDAO;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminDAO amministratoreDAO=new AdminDAO();
		
		String us=request.getParameter("nome");
		String pw=request.getParameter("pass");
		
		
		Admin amministratore=new Admin(us,pw,"","","");
		
		
		amministratore=amministratoreDAO.loginAdmin(amministratore);
		
		if(amministratore!=null){
			HttpSession session=request.getSession();
			session.setAttribute("autenticato", true);
			
			String ric=request.getParameter("ricorda");
			if(ric!=null && ric.equals("1"))
			  System.out.println("aggiungo cookie");
				Cookie ck = new Cookie("admin", us);
				ck.setMaxAge(60*60*24*2);
				response.addCookie(ck);
			
		
		         response.sendRedirect("AreaRiservata");
		}
		
		else 
		response.sendRedirect("error.html");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	


