//check whether number is divisble by 5 or not
import java.util.*;
class Divisible5{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("divisible number");
    int num=sc.nextInt();
    if(num %5 == 0){///25%5=0(reminder) , 23%5=3
      System.out.println("divisible yes");
    }
    else{
      System.out.println("divisible not");
    }
  }
}