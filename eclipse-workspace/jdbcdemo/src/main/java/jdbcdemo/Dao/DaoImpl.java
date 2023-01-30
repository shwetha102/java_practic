package jdbcdemo.Dao;

import java.sql.*;
import java.util.*;

public class DaoImpl {
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	
	public DaoImpl(){
		
		//1.register driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		//2.Get connection
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		if(con!=null) {
			System.out.println("connected successfully");
		}
	}
	
	public void insert() throws SQLException {
		//3.create the statement
				PreparedStatement pstmt=con.prepareStatement("insert into tarabai1 values(?,?,?)");
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter email");
				String email=sc.next();
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, email);
				
				//4.execute query
				int i=pstmt.executeUpdate();
				
				if(i>=1) {
					System.out.println("data inserted  successfully");
				}
				
				
	}
	public void update() throws SQLException {
		Statement st=con.createStatement();
		System.out.println("Enter id to update name of student");
		int id=sc.nextInt();
		System.out.println("Enter name to change");
		String name=sc.next();
		int i=st.executeUpdate("update tarabai1 set name='"+name+"' where id='"+id+"'");
		if(i>=1) {
			System.out.println("data updated  successfully");
		}
	}
	
	public void delete() throws SQLException {
    Statement st1=con.createStatement();
    System.out.println("Enter id to delete date of student");
	int id=sc.nextInt();
		int i=st1.executeUpdate("delete from tarabai1 where id='"+id+"'");
		if(i>=1) {
			System.out.println("data deleted  successfully");
		}
		
	}
	
	public void viewAllStudents() throws SQLException {
Statement st2=con.createStatement();
		
		ResultSet rs=st2.executeQuery("select * from tarabai1");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getString(3));
		}
	}
}
