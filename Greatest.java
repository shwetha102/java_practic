//find greatest number among 2 numbers
import java.util.*;
class Greatest{
  public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    if(num1>num2){
      System.out.println("num1 is greter");
    }
    else{
      System.out.println("num2 is greter");      
    }
  }
}
