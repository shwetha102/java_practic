package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UserDao.DaoImpl;

public class RegisterServlet extends HttpServlet{

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		String pass1=req.getParameter("pass1");
		
		PrintWriter pw=res.getWriter();
		
		try {
			DaoImpl obj=new DaoImpl();
			boolean b=obj.insert(uname, pass);
			if(b) {
				pw.print("Register successful");
			}
			else {
				pw.print("somthing went wrong");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
}
