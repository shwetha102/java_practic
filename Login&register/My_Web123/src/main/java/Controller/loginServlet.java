package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UserDao.DaoImpl;

public class loginServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		PrintWriter pw=res.getWriter();
		
		try {
			DaoImpl obj=new DaoImpl();
			boolean b=obj.login(uname, pass);
			if(b) {
				pw.print("login successful");
			}
			else {
				pw.print("Invalid user name & password");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
}
