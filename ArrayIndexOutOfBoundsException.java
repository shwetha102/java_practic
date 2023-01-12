/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/

import java.util.*;
public class ArrayIndexOutOfBoundsException{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
    int a=sc.nextInt();
    int ar[]=new int[a];
    System.out.println("Enter the elements");
    
      for(int i=0;i<a;i++){
      ar[i]=sc.nextInt();
      }
      try{
        
        for(int i=0;i<=a;i++){
        System.out.println(ar[i]);
      }
      }
    
    catch(Exception e){
        System.out.println(e);
    }
    
  }
}