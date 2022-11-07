//factors number
/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    for(int i=1;i<=n/2;i++){
      if(n%i==0){
        System.out.println(i);
      }
    }
  }
}
*/

/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("enter number");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
      if(count==2){
        System.out.println("prime number");
      }
      else{
        System.out.println("not prime number");
      }
    
  }
}
*/

/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int fact=1;
    System.out.println("enter number");
    int n=sc.nextInt();

  for(int i=1;i<=n;i++){
    fact=fact*i;
      
  }
    System.out.println(fact);
  }
}
*/

/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("enter number");
    int n=sc.nextInt();
    while(n>0){
      count++;
      n=n/10;
      
    }
    System.out.println(count);
  }
}
*/   

/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int sum=0,rem;
    System.out.println("enter number");
    int n=sc.nextInt();
    while(n>0){
      rem=n%10;
      sum=sum+rem;
      n=n/10;
    }
    System.out.println(sum);
  }
}
*/

/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int product=1,rem;
    System.out.println("enter number");
    int n=sc.nextInt();
    while(n>0){
      rem=n%10;
      product=product*rem;
      n=n/10;
    }
    System.out.println(product);
  }
}
*/

/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    //int sum=0;
    System.out.println("enter number");
    int n=sc.nextInt();
    int Last_digit=n%10;
    while(n>=9){
      n=n/10;
    }
    int First_digit=n;
    //sum=Last_digit + First_digit;
    //System.out.println(sum);
    System.out.println(First_digit);
    System.out.println(Last_digit);
  }
}

*/

/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter number");
    int n=sc.nextInt();
    int sum=0,rem,count=0,temp;
    temp=n;
    while(temp>0){
      temp=temp/10;
      count++;
      
    }
    temp=n;
    while(temp>0){
      rem=temp%10;
      sum=sum+(int)(Math.pow(rem,count));
      temp=temp/10;
    }
    if(n==sum){
    System.out.println("arm");
    }
    else{
      System.out.println("not arm");
    }
  }
}
*/

/*
import java.util.*;
class Factor{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter number");
    int n=sc.nextInt();
    
    for(int i=0;i<=n;i++){
    int sum=0,rem,temp,d;
    temp=i;
       
    while(temp>0){
      rem=temp%10;
      d=rem*rem*rem;
      sum=sum+d;
      temp=temp/10;
    }
    if(sum==i){
    System.out.println(sum);
    }
    }
  }
}
*/

/*
import java.util.*;
class Factor{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
int i=1,sum=0;
while(i<=n/2){
if(n%i==0){
sum=sum+i;
}
i++;
}
if(sum==n)
{
System.out.println("Perfect number");
}
else{
System.out.println("Not perfect number");
}

}
}

*/

/*
import java.util.*;
class Factor{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int n=sc.nextInt();
int sum;
for(int i=1;i<=n;i++)
{
int j=1;
sum=0;
while(j<=i/2){
if(i%j==0){
sum=sum+j;
}
j++;
}
if(sum==i)
{
System.out.println(i);
}
}
}
}
*/

/*
import java.util.*; 
class Factor{ 
public static void main(String args[]) { 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the range"); 
int n=sc.nextInt();//145 
int rem,fact,sum=0; 
int temp=n; 
while(n>0){ 
rem=n%10;//5 
fact=1; 
for(int i =1;i<=rem;i++){ 
fact=fact*i;
 } 
System.out.println(fact); 
sum=sum+fact; n=n/10; 
} 
System.out.println(sum); 
if(sum==temp){ 
System.out.println("strong number");
 } 
else{ 
System.out.println("not strong number"); 
} 
}
}
*/

/*
import java.util.*;
class Factor{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();//160
int count,sum=0,temp,rem,fact;
for(int i=1;i<=n;i++){ //1<=160
temp=i;
while(temp>0){
rem=temp%10;
fact=1;
for(int j=1;j<=rem;j++){
fact=fact*j;
}

sum=sum+fact;
temp=temp/10;
}
if(sum==i){
System.out.println(i);
}
sum=0;
}
}
}
*/

/*
import java.util.*;
class Factor{
public static void main(String args[])
{ 
int a=1;
for(int i=0;i<5;i++)
{
for(int j=i;j<5;j++){
System.out.print("  " ); 
}
for(int j=0;j<=i;j++){
System.out.print("* ");
  }
System.out.println();
}
}
}
*/

/*

import java.util.*;
class Factor{
public static void main(String args[])
{ 
int a=1;
for(int i=0;i<5;i++)
{
for(int j=0;j<=i;j++){
System.out.print("  " ); 
}
for(int j=i;j<5;j++){
System.out.print("* ");
  }
System.out.println();
}
}
}
*/

/*
import java.util.*;
class Factor{
public static void main(String args[])
{ 
int a=1;
for(int i=0;i<5;i++)
{
for(int j=i;j<5;j++){
System.out.print("* ");
  }
System.out.println();
}
}
}
*/

/*
import java.util.*;
class Factor{
public static void main(String args[])
{ 
int a=1;
for(int i=0;i<5;i++)
{
for(int j=0;j<=i;j++){
System.out.print("* ");
  }
System.out.println();
}
}
}
*/

import java.util.*;
class Factor{
public static void main(String args[])
{ 
int a=1;
for(int i=0;i<5;i++)
{
for(int j=i;j<5;j++){
System.out.print(" " ); 
}
for(int j=0;j<5;j++){
System.out.print("* ");
  }
System.out.println();
}
}
}