//Arithmetic Exception handling
import java.util.*;
class ArithException{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the a value");
    int a=sc.nextInt();
    System.out.println("Enter the b value");
    int b=sc.nextInt();
    int c=a/b;
    try{
       System.out.println(c);
    }   
    catch(ArithmeticException e){
      System.out.println(e);
     
    }
  System.out.println("Exception handled");
  }
}