//WAP to sum of two numbers
import java.util.Scanner;
class Sumsc{
  public static void main(String[] args){
    int num1, num2, sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num1 number");
    num1=sc.nextInt();
    System.out.println("enter num2 number");
    num2=sc.nextInt();
      
    sum=num1+num2;
    System.out.println("sum of two numbers"+sum);
  }
}