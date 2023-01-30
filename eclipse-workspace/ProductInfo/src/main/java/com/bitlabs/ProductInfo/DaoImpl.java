package com.bitlabs.ProductInfo;

import java.sql.*;

public class DaoImpl implements Dao{
	Connection con=null;
	DaoImpl(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
			if(con !=null)
				System.out.println("conected");
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void insert(ProductInfo p) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into ProductInfo values(?,?,?,?)");
			ps.setInt(1,p.getPid());
			ps.setInt(2,p.getPrice());
			ps.setInt(3,p.getQuantity());
			ps.setString(4,p.getPname());
			int i=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public void searchById(int id) {
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from ProductInfo where pid='"+id+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public void viewAll() {
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery("select * from ProductInfo");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}


