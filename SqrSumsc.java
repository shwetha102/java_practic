//write java program to sum of squares of 2 numbers
import java.util.Scanner;
class SqrSumsc{
  public static void main(String args[]) {
    int a, b, sum, sum_square;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    a=sc.nextInt();
    System.out.println("enter b number");
    b=sc.nextInt();
    sum = a + b;
    sum_square = sum * sum;
    System.out.println("the sum of two number is " + sum);
    System.out.println("the sum of Square of two number is " + sum_square);
  }
}