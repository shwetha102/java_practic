//
import java.util.Scanner;
class Assign{
  public static void main(String[] args){
    double dis,x1,x2,y1,y2;
    
    Scanner sc=new Scanner(System.in);
 
	  System.out.println("enter x1 point");
	   
    x1=sc.nextDouble();
    
    System.out.println("enter x2point");
	   
    x2=sc.nextDouble();
	    
    System.out.println("enter y1 point");
	   
    y1=sc.nextDouble();
 	  
	  System.out.println("enter y2 point");
	   
    y2=sc.nextDouble();
    
    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    
             System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") "+dis);
    
  }
}