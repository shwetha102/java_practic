//Write a JAVA program to input any character and check whether it is alphabet, digit    or special character.
import java.util.*;
class CharDigit{
  public static void main(String[]args){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter alpabet,digit and special charcter");
    ch=sc.next().charAt(0);
    if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z')){
      System.out.println("alpabet");
    }
    else if(ch>='0'&& ch<='9'){
      System.out.println("digit");
    }
    else{
      System.out.println("special charcter");
    }
  }
}