package enrollment;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.ResultSet;
import dbconnection.DbConnection;
import org.apache.log4j.*;

public class DatabaseServlet extends HttpServlet {
	
	static Logger log = Logger.getLogger(DatabaseServlet.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/* Connection conn = null; */
		String Uname = request.getParameter("username");
		
		System.out.println("username :::" + Uname);
		log.info("username :::" + Uname);
		
		try {
			DbConnection db = new DbConnection();
			System.out.println("Connected!");
			log.info("Connected");
			ArrayList<String> al = null;
			ArrayList<ArrayList<String>> pid_list = new ArrayList<ArrayList<String>>();
			String query = "select * from user where username='" + Uname + "' ";

			System.out.println("query= " + query);
			log.info("query=" + query);
			ResultSet rs = db.getResultSet(query);

			while (rs.next()) {

				al = new ArrayList<String>();

				out.println(rs.getString(1));
				out.println(rs.getString(2));
				out.println(rs.getString(3));
				out.println(rs.getString(4));

				al.add(rs.getString(1));
				al.add(rs.getString(2));
				al.add(rs.getString(3));
				al.add(rs.getString(4));

				System.out.println("Result :: " + al);
				pid_list.add(al);
			}

			request.setAttribute("piList", pid_list);
			RequestDispatcher view = request.getRequestDispatcher("/Successpage.jsp");
			view.forward(request, response);
			rs.close();
			System.out.println("Disconnected!");
			log.info("disconnected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}