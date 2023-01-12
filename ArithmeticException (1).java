/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/

import java.util.*;
public class ArithmeticException {

    public static void main(String args[]) {
       int num1,num2;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number num1");
      num1=sc.nextInt();
      System.out.println("enter number num2");
      num2=sc.nextInt();
      int ch;
      ch=sc.nextInt();
      switch(ch){
         
        case 1:
          
          System.out.println("Addition of two numbers"+(num1+num2));
          break;
        case 2:
          
          System.out.println("substraction of two numbers"+(num1-num2));
          break;
        case 3:
          
          System.out.println("multiplication of two numbers"+ (num1*num2));
          break;
        case 4:
          //arithmeticException
          try{
             
            System.out.println("division of two numbers"+(num1/num2));
          }
          catch(Exception e){
            System.out.println(e);
          }
          System.out.println("error is handled");
          break;
        default:
          System.out.println("please write numbers only");
      }
    }
}

