package dbconnection;

import java.util.*;
import java.io.*;
import java.sql.*;

public class DbConnection {
	
	public static Connection con = null;
	
	public String dbDriver;
	public String dbHost;
	public String dbName;
	public String dbUser;
	public String dbPassword;
	public String dbSsl;

	public void getdbinfo() {
		Properties pro = new Properties();
		InputStream input = null;
		
		try {
			 /*this.getClass().getClassLoader().getResourceAsStream("classes/my.properties")*/
		input=DbConnection.class.getClassLoader().getResourceAsStream("C:\\Users\\Mourya Raj\\eclipse-workspace\\Registration\\WebContent\\WEB-INF\\dbconfig.properties");
	//	input = this.getClass().getClassLoader().getResourceAsStream("dbconfig.properties");
		//servletContext.getResourceAsString("/WEB-INF/resource/my.properties");
			
		//	ServletContext ctx  =getServletContext();
		//	InputStream configStream = ctx.getResourceAsStream("/WEB-INF/dbconfig.properties");

		//		if(input !=null){
			//	    pro.load(input);
			//	}

		pro.load(input);
		
			dbDriver = pro.getProperty("DB_Driver");
			dbHost = pro.getProperty("DB_Host");
			dbName = pro.getProperty("DB_Name");
			dbSsl=pro.getProperty("DB_Ssl");
			dbUser = pro.getProperty("DB_User");
			dbPassword = pro.getProperty("DB_Password");
		

		if (dbPassword.isEmpty() || dbPassword == null) {
			dbPassword = "";
			}
			
			input.close();
			input = null;
			pro = null;
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public Connection getDefaultcon() {
		String dbHostUrl=null;
		try {
			getdbinfo();
			
			dbHostUrl=dbHost + "/" + dbName + dbSsl;
			
			Class.forName(dbDriver).newInstance();
			
			con=DriverManager.getConnection(dbHostUrl,dbUser,dbPassword);
			
		return con;
		
		}catch(Exception ex) {
			try {
				con.close();con=null;
			}
			catch(Exception e) {
				ex.printStackTrace();
			}
		}
		return null;
	}
	
	
	public ResultSet getResultSet(String sql) {
		try {
			if(con==null || con.isClosed()) {
				con=getDefaultcon();
			}
			Statement st=con.createStatement();
			
			return st.executeQuery(sql);
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return null;
		}
	
	public void executesql(String sql) {
		try {
			if(con==null || con.isClosed()) {
				con=getDefaultcon();
			}
			
			Statement st=con.createStatement();
			st.execute(sql);
			
			st.close();
			st=null;
			
			try{con.commit();}
			catch(Exception e) {}
		}
		catch(Exception ex) {ex.printStackTrace();}
		}
	}

