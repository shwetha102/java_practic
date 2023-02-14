package UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoImpl {
	Connection con;

	public DaoImpl() throws ClassNotFoundException, SQLException{
	
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/madar","root","root");
	
	}
	
	public boolean login(String uname,String password) throws SQLException {
		
		boolean b=false;
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from test");
		
		while(rs.next()) {
			if(rs.getString(1).equals(uname) && rs.getString(2).equals(password)) {
				b=true;
			}
		}
		return b;
		
		
	}
	public boolean insert(String uname,String password) throws SQLException {
		boolean b=false;
		PreparedStatement ps=con.prepareStatement("insert into test values(?,?)");
		ps.setString(1, uname);
		ps.setString(2, password);
		int i=ps.executeUpdate();
		
		if(i>=1) {
			b=true;
		}
		return b;
		
		
	}
	
	
}
