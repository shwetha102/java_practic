/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {

//main method
  public static void main(String args[]){

//declare variables and take input from user
    String str;
    Scanner sc=new Scanner(System.in);

//creat stringbuffer object for string reversing
//reverse input string
//print entire string result
//call reverWordInMyString method
        System.out.println("Enter the string");
        str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        System.out.println("Reversed string= "+sb.reverse());
        String[] words=str.split(" ");
        String reversedString="";

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/
    for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String reversedWord=" ";
            for(int j=word.length()-1;j>=0;j--)
            {
/* 
   Use charAt() function returns the character
   at the given position in a string
*/
                reversedWord=reversedWord+word.charAt(j);
            }
            reversedString=reversedString+reversedWord+" ";
        }
//print reverse each word string result
        System.out.println("reversing each word at its place: "+reversedString);
    }

}