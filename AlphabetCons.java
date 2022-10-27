//Write a JAVA program to input any alphabet and check whether it is vowel or    consonant.
import java.util.*;
class AlphabetCons{
  public static void main(String[] args){

  char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter vowel and consonant");
    ch=sc.next().charAt(0);
    if((ch=='a')||(ch=='i')||(ch=='o')||(ch=='e')||(ch=='u'))
       System.out.println("vowel");
    else
      System.out.println("consonant");
  }
}