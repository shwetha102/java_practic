/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/

import java.util.Scanner;

public class InsertionSort {

//main method
 public static void main (String[] args){
        Scanner sn=new Scanner(System.in);
//take input from user
   System.out.println("enter n value");
        int n =sn.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values");        

//create integer array for all elements
    for(int i=0;i<n;i++)
        {
            arr[i]=sn.nextInt();
        }
        for(int i=1;i<arr.length;i++)
        {
            int key;
            key=arr[i];

//call sort method

//print sorted array

//create sort method

//declare variables
 int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
// storing current element whose left side is checked for its correct position 

//check whether the adjacent element in left side is greater or less than the current element.

// move the left side element to one position forward.

 // move current element to its  correct position.
   System.out.println("sorting values are:");
        for(int i=0;i<arr.length;i++)
        {
             System.out.println(arr[i]);
        }

    
    }

}