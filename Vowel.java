//write a program to execute a vowels by using switch case

import java.util.Scanner;
class Vowel{
  public static void main(String args[]) {

 

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter character");
    char ch=sc.next().charAt(0);
    switch(ch){
      case 'A':
        System.out.println("vowel");
        break;
      case 'E':
        System.out.println("vowel");
        break;
      case 'I':
        System.out.println("vowel");
        break;
      case 'O':
        System.out.println("Vowel");
        break;
      case 'U':
        System.out.println("vowel");
        break;
      default:
        System.out.println("consonant");
    }
   
   
  }
}