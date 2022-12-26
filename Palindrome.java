/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

//main method
  public static void main(String args[]){

//declare varible
    String a,b="";
    Scanner s=new Scanner(System.in);

//take input from user
    System.out.println("Enter the string ");
    a=s.nextLine();
    int n=a.length();

/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/
      for(int i=n-1;i>=0;i--)
    {
        b=b+a.charAt(i);
    }
    if(a.equalsIgnoreCase(b))
    {
        System.out.println("Malayalam is a Palindrome");
    }
    else
    {
        System.out.println("Malayalam is not a Palindrome");
    }
}

}