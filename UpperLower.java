//Write a JAVA program to check whether a character is uppercase or lowercase     alphabet.
import java.util.*;
class UpperLower{
  public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character");
    char ch=sc.next().charAt(0); 
    if(ch>='A' && ch<='Z'){
      System.out.println("upper");
    }
    else if(ch>='a' && ch<='z'){
      System.out.println("lower");
    }
    else {
      System.out.println("invalid");
    }
  }
}