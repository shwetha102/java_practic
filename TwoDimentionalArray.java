/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
  public static void main(String args[]){

//Declare the variables
     Scanner s=new Scanner(System.in);
      System.out.println("Enter the rows and column");
      int n1=s.nextInt();
      int n2=s.nextInt();
      int in1,in2;
      int i,j;

//Take number of rows and columns from user in two-dimensional array
    int a[][]=new int[n1][n2];

//assume first element is largest and use for loop to compare the largest element with all the reamaining elements
     for( i=0;i<n1;i++){
         for( j=0;j<n2;j++){
            //asking to enter the array values.
            System.out.print("Enter arr " + "[ " + i + " ]" + "[ " + j + " ] : ");
            a[i][j]=s.nextInt();
         }
      }
      int max=a[0][0];
      int index1=0,index2=0;
     
      for( i=0;i<n1;i++){
         for( j=0;j<n2;j++){
               
//Calcualte the maximum element based on index poistion
             if(a[i][j]>max){
               max=a[i][j];
                index1=i;
              index2=j;
            }
            

         }
         
      }
    
//Print result
    System.out.print("Largest element in array is  " +max+ "arr " + "[ " + index1 + " ]" + "[ " + index2 + " ]  ");
       
   }

}