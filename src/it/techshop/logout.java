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
 * Servlet implementation class logout
 */
@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		HttpSession session=request.getSession();
		session.invalidate();
		
		
		Cookie[] cookies=request.getCookies();
		if (cookies!=null)
			for(int i=0; i< cookies.length; i++)
				if(cookies[i].getName().equals("loginCookie")){
					String value=cookies[i].getValue();
					if (value.equals("fewfwe")){
						cookies[i].setMaxAge(0);
						response.addCookie(cookies[i]);
					}
					break;
				}

		response.getWriter().append(session.getId());
		response.sendRedirect("http://localhost:8080/techshop/");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
