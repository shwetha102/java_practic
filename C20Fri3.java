//length and distance
import java.util.*;
class C20Fri2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int caluclate_steps;
    System.out.println("enter length");
    int total_length=sc.nextInt();
    System.out.println("enter distance");
    int distance_to_reach=sc.nextInt();

    for(int i=0;i<=total_length;i++){
      caluclate_steps=(total_length - distance_to_reach);
      
    }
    System.out.println(caluclate_steps);
    
  }
}