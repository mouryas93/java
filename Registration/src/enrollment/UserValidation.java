package enrollment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String Email = request.getParameter("email");
		

		if (name.isEmpty() || username.isEmpty() || password.isEmpty() || Email.isEmpty()) {
			RequestDispatcher req = request.getRequestDispatcher("Information.jsp");
			req.include(request, response);
		} else {
			RequestDispatcher req = request.getRequestDispatcher("Registration.jsp");
			req.forward(request, response);
		}
		request.getRequestDispatcher("/RegistrationServlet").forward(request, response);
	}

}
