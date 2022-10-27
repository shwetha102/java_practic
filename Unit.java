//electricity bill
import java.util.Scanner; 
public class Unit{ 
  public static void main(String[] args) { 
    
    Scanner s=new Scanner(System.in); 
    System.out.println("Enter electricity bill in units"); 
    int units=s.nextInt(); 
    double bill=0; 
    if(units<=50){ 
      bill=units*0.50; 
    } 
    else if(units<=150) { 
      bill=25+(units-50)*0.75; 
    
    } 
    else if(units<=250){ 
      bill=25+75+(units-150)*1.20; 
    } 
    else
    {
      bill=25+75+120+(units-250)*1.50; 
    } 
    System.out.println("your electricity bill is: "+(bill+(bill*20)/100)); 
  } 
}