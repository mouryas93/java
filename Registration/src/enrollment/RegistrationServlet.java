package enrollment;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.log4j.Logger;
import dbconnection.DbConnection;


public class RegistrationServlet extends HttpServlet {

	static final Logger LOGGER = Logger.getLogger(RegistrationServlet.class);
	String Name, Userpassword, UserName, Useremail;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		response.sendRedirect("/Error.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Name = request.getParameter("name");
		UserName = request.getParameter("username");
		Useremail = request.getParameter("email");
		Userpassword = request.getParameter("password");

		/*
		 * System.out.println("Name ::: " + Name); System.out.println("userName ::: " +
		 * UserName); System.out.println("useremail ::: " + Useremail);
		 * System.out.println("userpassword ::: " + Userpassword);
		 */
		LOGGER.info("Name ::: " + Name);
		LOGGER.info("userName ::: " + UserName);
		LOGGER.info("useremail ::: " + Useremail);
		LOGGER.info("userpassword ::: " + Userpassword);

		try {
			DbConnection db = new DbConnection();
					
			String query = ("insert into user(name,username,email,password) values(?,?,?,?)");
			/*
			 * PreparedStatement statement = con.prepareStatement(query);
			 * statement.setString(1, Name); statement.setString(2, UserName);
			 * statement.setString(3, Useremail); statement.setString(4, Userpassword);
			 */

			db.executesql(query);

		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		 /*request.getRequestDispatcher("/DatabaseServlet").forward(request, response); */
		ServletContext servletContext = getServletContext();
		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/DatabaseServlet");
		requestDispatcher.forward(request, response);
	}
}
