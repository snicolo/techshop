package it.techshop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import it.techshop.login;
import it.techshop.dao.beans.Admin;

/**
 * Servlet implementation class AreaRiservata
 */
@WebServlet("/AreaRiservata")
public class AreaRiservata extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AreaRiservata() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.getAttribute("admin");
		boolean trovatoCookie=false;

		Cookie[] ck=request.getCookies();
		if(ck != null){
			for(int i=0; i< ck.length; i++)
				if(ck[i].getName().equals("admin")){
					String value=ck[i].getValue();
					if(value.equals("admin"))
						trovatoCookie=true;
					break;
				}

			System.out.println(trovatoCookie);

			HttpSession session=request.getSession();
			if(session.getAttribute("autenticato")==null && trovatoCookie==false)
				response.sendRedirect("error.html");
			else
				response.sendRedirect("adminarea.jsp");

		}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
