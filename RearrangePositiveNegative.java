/*  JFM1T11_Assignment5 :

    Write a program to sort an array containing negative, non-negative and zero values in descending order.
    Prompt the user input from the terminal.
    
    Sample Input: 2,-3,-1,4,-2
    
    Expected Output: -3,-2,-1,4,2
    
*/

import java.util.Scanner;

public class RearrangePositiveNegative {

//main method
  public static void main (String[] args){
        Scanner sn=new Scanner(System.in);

//take input from user
        System.out.println("enter n value");
        int n =sn.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values");

//call descending method

//print result

//create descending method

//declare and initialize variables
    for(int i=0;i<n;i++)
        {
            arr[i]=sn.nextInt();
        }
        for(int i=1;i<arr.length;i++)
        {
            int key;
            key=arr[i];
            
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

//check each element if the element is less then zero and the both numbers are not equal  then it swaps them

//increasing elements untill all elements rearranged
    System.out.println("Rearrange Positive and Negative values:");
        for(int i=0;i<arr.length;i++)
        {
             System.out.println(arr[i]);
        }

    
    }

}