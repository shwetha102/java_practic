/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
public class NumberFormatException {
  public static void test(int num1,int num2){
   System.out.println(num1+num2); 
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numerical values ");
    String num1=sc.next();
    String num2=sc.next();
    int a,b;
    a=Integer.parseInt(num1);
    b=Integer.parseInt(num2);   
    try{
    test(a,b);
    }   
    catch(Exception e){
      System.out.println(e);
     
    }
  System.out.println("Exception handled");
  }
}
