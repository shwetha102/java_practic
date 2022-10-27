// number is positive numer or not
import java.util.*;
class Possitive{
  public static void main(String[] args){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    num=sc.nextInt();
    if(num>0)
      System.out.println("number possitive");
    
    else
      System.out.println("number is not possitive");
    
  }
}