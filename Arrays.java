//fruits find
/*
import java.util.*;
class Arrays{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String a[]={"orrange","banana","apple","berry"};
    System.out.println("enter fruit name");
    String n=sc.next();
    int count=0;
    
    for(int i=0;i<=a.length;i++){
      if(a[i].equals (n)){
        count++;
        break;
      }
    }
      if(count==1){
        System.out.println("found");
      }
      else{
        System.out.println("not found");
      }
    
  }
}
*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[])
  { 
    int a[]={324,121,454,456,678,153,371,6,28};
    int min=a[0],index=0;
    
    for(int i=0;i<a.length;i++){
      if(a[i]<min){
        min=a[i];
        index=i;
      }
    }
      
    System.out.println("Min element is "+min+" found at "+ (index)+"th index");
    }
  }
*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[])
  { 
    int a[]={324,121,454,456,678,153,371,6,28};
    int max=a[0],index=0;
    
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
        index=i;
      }
    }
      
    System.out.println("Max element is "+max+" found at "+ (index)+"th index");
    }
  }
*/

/*
class Arrays{
  public static void main(String[]args){
    
    int evenc=0,oddc=0;
    int a[]={23,4,6,7,8,9};
        
    for(int i=0;i<a.length;i++){
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
class Arrays{
  public static void main(String[]args){
    
    int a[]={-3,2,4,-8,9};
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]<0){
        count++;
      }
    }
    System.out.println("Negative number is"+count);
  }
}
*/

/*
class Arrays{
public static void main(String args[]){
int a[]={1,2,3,4,5,8};
int b[]=new int[a.length];
    for(int i=0;i<a.length;i++){
      b[i]=a[i];
    }
     for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
   }
}
}
*/

/*
import java.util.*;
class Arrays{
public static void main(String args[])
{ 
int a[]={324,121,454,456,678};
int temp,rem,rev=0;
//to iterate array elements
System.out.println("plaindrome numbers");
for(int i=0;i<a.length;i++){
temp=a[i];//temp=121
rev=0;
while(temp>0){//0>0
rem=temp%10;//3%10=3
rev=rev*10+rem;//40+2=420+3=423
temp=temp/10;//324/10=32/10=3/10=0 
}

if(a[i]==rev){//324==423
System.out.println(a[i]);
}

}

}
}
*/

/*

import java.util.*;
class Arrays{
public static void main(String args[])
{ 
int a[]={324,121,454,456,678,153,371,6,28};
int temp,rem,sum=0;
//to iterate array elements
System.out.println("perfect numbers");
for(int i=0;i<a.length;i++){
sum=0;
for(int j=1;j<=a[i]/2;j++){
if(a[i]%j==0){
sum=sum+j;
}
}
if(sum==a[i]){
System.out.println(a[i]);
}

}

}
}
*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int n=sc.nextInt();
    int a[]=new int[n+1];
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("enter index position");
    int index_pos=sc.nextInt();
    System.out.println("enter new element");
    //insertion process
   int ele=sc.nextInt();
    for(int i=n-1;i>=index_pos;i--){
      a[i+1]=a[i];
      
    }
    a[index_pos]=ele;
    System.out.println("after insertion");
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    
    }
  }

*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[])
  { 
    int a[]={10,5,20,7};
    int temp;
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          
        }
      }
    }
    System.out.println("after sorting");
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    }
  }
*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[])
  { 
    int a[]={10,5,20,7};
    int temp;
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]<a[j]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          
        }
      }
    }
    System.out.println("after sorting");
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    }
  }
*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[])
  { 
    int a[]={10,5,20,7,10,5};
  int count=0;
    System.out.println("Duplicates elements");
    for(int i=0;i<a.length;i++){
      count=0;
      for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
          count++;
        }
        
      }
      if(count>0){
        System.out.println(a[i]);
      }
    }
   
    }
    }
*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[])
  { 
    int a[]={1,2,1,3,2,1,4};
    int fr[]=new int[a.length];
    int visited=-1;
  int count=0;
    System.out.println("Duplicates elements");
    for(int i=0;i<a.length;i++){//i=0
      count=1;
      for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
          count++;//2
          fr[j]=visited;
        }
       }
      if(fr[i]!=visited){
        fr[i]=count;
      }
    }
  System.out.println(" elements |frequency ");
    for(int i=0;i<a.length;i++){
      if(fr[i]!=visited){
      System.out.println(a[i]+"       "+fr[i]);
      }
    }
   
    }
    }

*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter row size");
    int row=sc.nextInt();
    System.out.println("enter col size");
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    //Reading
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        a[i][j]=sc.nextInt();
      }
    }
    //display
    
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
       System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    }
    }
*/

/*
import java.util.*;
class Arrays{
  public static void main(String args[]){
    int a[][]={{12,34,45},{34,56,78},{78,9,10}};
    
    //display
    
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
class Arrays{
  public static void main(String args[]){
    int a[][]={{12,34,45},{34,56,78},{78,9,10}};
    int b[][]={{12,34,45},{34,56,78},{78,9,10}};
    int c[][]=new int[3][3];
    
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        c[i][j]=a[i][j]+b[i][j]; 
       System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }
    }
    }
*/
