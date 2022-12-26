/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/


import java.util.Scanner;
import java.lang.*;
public class SubStringWithoutInbuilt {

//main method
  public static void main(String args[]){

//declare variables
    String s;
    String ss;
    Scanner sc=new Scanner(System.in);

//take input from user
     System.out.println("Enter the string");
     s=sc.nextLine();
     System.out.println("Enter the word to be searched");
     ss=sc.next();
     boolean result=false;
    String arr[]=s.split(" ");
    int count=0;
    for(String a: arr){
      if(ss.equals(a)){
      count++;
      }
      
    }

    if(count ==0)
    {
        System.out.println("Excepted output:"+ss+" is not found");
    }
    else
    {
        System.out.println("Excepted output:"+ss+" is found");
    }
}
}


