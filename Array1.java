//print values
/*
class Array1{
  public static void main(String[]args){
    int a[]={1,2,3,4,5,6};
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}
*/

/*
class Array1{
  public static void main(String[]args){
    int a[][]={{1,2,3},{1,2,3},{1,2,3}};
    
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
       System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}
*/

/*
import java.util.*;
class Array1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int evenc=0,oddc=0;
    System.out.println("Enter elements in array");
      int n =sc.nextInt();
      int a[] = new int[n];
     System.out.println("Enter elements");
        for (int i = 0; i < n; i++) 
        {
            a[i] =sc.nextInt();
        }
                
    for(int i=0;i<n;i++){
      if(a[i]%2==0){
        evenc++;
      }
      else{
        oddc++;
      }
    }
    System.out.println("even number"+evenc);
    System.out.println("odd number"+oddc);
  }
}
*/
/*
import java.util.*;
class Array1{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter array number");
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
    for(int i=0;i<n;i++)
      {
        if(arr[i]%2==0)
          System.out.println(arr[i]);
        
      }
  }

  */


//two dimentinal array negative and count +ve and -ves
/*
 import java.util.*; 
class Array1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array");
    int n=sc.nextInt();
    System.out.println("enter 2nd array");
    int b=sc.nextInt();
    int negcount=0,poscount=0;   
    int a[][]=new int[n][b];
    System.out.println("enter elements of array");
      
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           if(a[i][j]<0){
             negcount++;
           }
          else{
            poscount++;
          }
        }
      }
        
      System.out.println("negative number"+negcount);
       System.out.println("positive number"+poscount);
      
  }
}
*/

/*
import java.util.*;
class Array1{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int countPos=0,countNeg=0;
    System.out.println("Enter the row Size");
    int row=s.nextInt();
    System.out.println("Enter the row Size");
    int colm=s.nextInt();
    int a[][]=new int[row][colm];
    System.out.println("Enter the array");
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        a[i][j]=s.nextInt();
      }
    }
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        if(a[i][j]>0){
          countPos++;
        }
        else{
          countNeg++;
        }
      }
  }
    System.out.println("The postive number in array is "+countPos);
    System.out.println("The negative number in array is "+countNeg);
}
}
*/

/*
import java.util.*;
class Array1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row Size");
    int row=sc.nextInt();
    System.out.println("Enter the colm Size");
    int colm=sc.nextInt();
    
    int a[][]=new int[row][colm];
    int b[][]=new int[row][colm];
    int c[][]=new int[row][colm];
    System.out.println("Enter the array");
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        a[i][j]=sc.nextInt();
      }
    }
    
    for(int i=0;i<row;i++){
      for(int j=0;j<colm;j++){
        c[i][j]=a[i][j]+b[i][j]; 
       System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }
    }
    }
*/

import java.util.*; 
class Array1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("enter array");
    int n=sc.nextInt();
    int a[][]=new int[n][n];
    System.out.println("enter elements");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
    }
      for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]!=20){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}