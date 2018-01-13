package it.techshop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		boolean trovatoCookie=false;
		Cookie[] cookies=request.getCookies();
		  if(cookies != null)
			  for(int i=0; i< cookies.length; i++)
				  if(cookies[i].getName().equals("loginCookie")){
					  String value=cookies[i].getValue();
					  if(value.equals("fewfwe"))
					  trovatoCookie=true;
					  break;
				  }
		  
		  System.out.println(trovatoCookie);
		  
		  HttpSession session=request.getSession();
		  if(session.getAttribute("autenticato")==null && trovatoCookie==false)
			  response.sendRedirect("error.html");
			  else
				  response.sendRedirect("adminarea.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
