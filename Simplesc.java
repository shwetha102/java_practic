//write a java program to find simple interest
import java.util.Scanner;
class Simplesc{
  public static void main(String args[]){
    int p,r,t,si;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter p number");
    p=sc.nextInt();
    System.out.println("enter r number");
    r=sc.nextInt();
    System.out.println("enter t number");
    t=sc.nextInt();
    si=(p*r*t)/100;
    System.out.println("simple interest"+si);
    
  }
}