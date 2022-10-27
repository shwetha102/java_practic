//write java program to find the percentage of  subjects
import java.util.Scanner;
class Sub3sc{
  public static void main(String args[]) {
    int eng, math, kannada,total;
    double percentage;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter eng marks");
    eng=sc.nextInt();
    System.out.println("enter math marks");
    math=sc.nextInt();
    System.out.println("enter kannada marks");
    kannada=sc.nextInt();
    total = eng + math + kannada;
    percentage = ((100*eng)/total+(100*math)/total+(100*kannada)/total);
    System.out.println("total of subjects"+total);
    System.out.println("percentage of subjects"+percentage);
  }
}