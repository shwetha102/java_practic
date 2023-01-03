//1.Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers.Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
import java.util.*;
class AritMatic{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the a value");
    int a=sc.nextInt();
    System.out.println("Enter the b value");
    int b=sc.nextInt();
    
    try{
      System.out.println("ArithmeticException will occur ");
       System.out.println(a/b);
    }   
    catch(ArithmeticException e){
      System.out.println(e);
     
    }
      
  }
}