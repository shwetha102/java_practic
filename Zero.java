//number is zero or not
import java.util.*;
class Zero{
  public static void main(String[] args){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    num=sc.nextInt();
    if(num==0)
      System.out.println("number zero");
    
    else
      System.out.println("number is not zero");
    
  }
}