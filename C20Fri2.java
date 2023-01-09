//deprecient rate
import java.util.*;
class C20Fri2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int temp;
    System.out.println("enter cost");
    int initial_cost=sc.nextInt();
    System.out.println("enter year");
    int year=sc.nextInt();
    System.out.println("enter depreciation");
    int depreciation=sc.nextInt();
    temp=initial_cost;
    for(int i=0;i<year;i++){
      temp=((100-depreciation)*temp)/100;
     
    }
     System.out.println(temp);
  }
}