//write a java program to perimeter of triangle
import java.util.Scanner;
class Peritraisc{
  public static void main(String args[]) {
    // Perimeter of triangle
    int a, b, c, Peri;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    a=sc.nextInt();
    System.out.println("enter b number");
    b=sc.nextInt();
    System.out.println("enter c number");
    c=sc.nextInt();
            
    Peri = a + b + c;
    System.out.println("The Perimeter of triangle is " + Peri);
  }
}