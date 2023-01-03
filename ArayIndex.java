//3. Write a program which will illustrate ArrayIndexOutOfBoundsException.
//Create an array variable with n size, accept values from user and store values into array, finally print all values on console.Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"

// import java.util.*;
// class ArayIndex{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter size of array");
//     int a=sc.nextInt();
//     int ar[]=new int[a];
//     System.out.println("Enter the elements");
    
//       for(int i=0;i<a;i++){
//       ar[i]=sc.nextInt();
//       }
//       try{
        
//         for(int i=0;i<=a;i++){
//         System.out.println(ar[i]);
//       }
//       }
    
//     catch(ArrayIndexOutOfBoundsException e){
//         System.out.println(e);
//     }
    
//   }
// }


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt();

    int[] array = new int[n];

    System.out.println("Enter values for the array:");
    for (int i = 0; i < n; i++) {
      array[i] = scanner.nextInt();
    }

    System.out.println("The values in the array are:");
    for (int i = 0; i < n; i++) {
      System.out.println(array[i]);
    }
  }
}





