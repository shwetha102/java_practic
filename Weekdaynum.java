//Write a JAVA program to input week number and print week day.
import java.util.*;
class Weekdaynum{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int wn;
    System.out.println("enter weeknumber");
    wn=sc.nextInt();
    if(wn==1){
      System.out.println("sunday");
    }
    else if(wn==2){
      System.out.println("monday");
    }
    else if(wn==3){
      System.out.println("tuesday");
    }
    else if(wn==4){
      System.out.println("thursday");
    }
    else if(wn==5){
      System.out.println("friday");
    }
    else if(wn==6){
      System.out.println("saturday");
    }
      else if(wn==7){
      System.out.println("wednesday");
    }
    else {
      System.out.println("invalid");
    }
      
  }
}