//WAP to perimeter of circle
import java.util.Scanner;
class PeriCirclesc{
  public static void main(String[] args){
    int r;
    double pi=3.14,peri;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter peri of circle ");
    r=sc.nextInt();
    peri=2*pi*r;
      System.out.println("peri of circle"+peri);
  }
}