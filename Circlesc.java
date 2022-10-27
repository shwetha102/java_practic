import java.util.Scanner;
public class Circlesc{
   public static void main(String args[]){
      int r;
      double area,pi=3.14;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of the circle ");
      r = sc.nextInt();
      area = (r*r)*pi;
      System.out.println("Area of the circle is "+area);
   }
}