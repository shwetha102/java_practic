package jdbcdemo;

import java.sql.SQLException;
import java.util.*;

import jdbcdemo.Dao.DaoImpl;


public class App {

	public static void main(String args[]) throws SQLException {
		Scanner sc=new Scanner(System.in);
		int option=0;
		DaoImpl obj=new DaoImpl();
		
			
		
		do {
		System.out.println("Enter 1 for insert");
		System.out.println("Enter 2 for update");
		System.out.println("Enter 3 for delete");
		System.out.println("Enter 4 for viewall student");
		System.out.println("Enter 0 for Exit");
		System.out.println();
	     option=sc.nextInt();
		
	     if(option==1) {
	    	 obj.insert();
	     }
	     else if(option==2) {
	    	 obj.update();
	     }
	     else if(option==3) {
	    	 obj.delete();
	     }
	     else if(option==4) {
	    	 obj.viewAllStudents();
	     }
		}while(option != 0);
		
	}
}
