//write a java program to solve the quadratic equation
import java.util.Scanner;
class Quadraticsc{
  public static void main(String args[]){
    //to solve the quadratic equation
    int a,b,c,quad;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    a=sc.nextInt();
    System.out.println("enter b number");
    b=sc.nextInt();
    System.out.println("enter c number");
    c=sc.nextInt();
    quad=(b*b)-4*a*c;
    System.out.println("quad formula"+quad);
  }
}