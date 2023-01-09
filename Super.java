//Super Quiz Bee is a famous quiz Competition that tests students on a wide variety of academic subjects. This week’s competition was a Team event and students who register for the event will be given a unique registration code N. The participants are teamed into 10 teams and the team to which a participant is assigned to depends on the absolute difference between the first and last digit in the registration code. The event organizers wanted your help in writing an automated program that will ease their job of assigning teams to the participants. If the registration number given is less than 10, then the program should display "Invalid Input". 
//Input Format: The only line of input contains an integer N. Output Format: Output the absolute difference between the first and last digit of N. Refer sample input and output for formatting specifications. Sample Input 1: 345 Sample Output 1: 2 Sample Input 2: 9

// import java.util.*;

// class Super{
//   public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     int f, l;
//     System.out.println("enter the number");
//     int n=sc.nextInt();
//     if(n<10){
//       System.out.println("Invali input");
//     }
    
    
//   }
// }

// import java.util.*;
// class Super{
//   public static void main(String args[]){
//     int n,s,g,i;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter number");
//     n=sc.nextInt();
//     int arr[]=new int[10];
//     if(n/10==0){//124
//       System.out.println("Invalid Input");
//     }
//     else{
//     for( i=0;n>0;i++){//124>0
//       s=n%10;//4//0
//       n=n/10;//12//1
//       arr[i]=s;//4//0arr[0]=4arr[1]=0
//     }
    
//     g=(arr[0]-arr[i-1]);//4-
//     System.out.println(g);
//   }
// }
// }

// class Super{
//   public static void main(String args[]) {
//    String s1="hi mam you are wow";
//    String str[]=new String[5];
//     str
//    String rev="";
     
//     for(int i=s1.length()-1;i>=0;i--){
//      rev=rev+s1.charAt(i);
//      // rev="";
//     }
//     if(s1.equals(rev)){
//       System.out.println("Palindrome names"+s1);
//     }
//     // else{
//     //   System.out.println("Not palindrome");
//     // }
 
//   }
// }




// class Super{
//   public static void main(String args[]) {
//    String s1="hi mam you are wow";
//     String w[]=s1.split(" ");
//     int min=w[0].length();
//     int ind=0;
//     for(int i=1;i<w.length;i++){
//       if(min>w[i].length()){
//         min=w[i].length();
//         ind=i;
//       }
    
//     }
//      System.out.println("minimum word is"+min);   
  
//   }
// }


// class Super{
//   public static void main(String args[]){
//     String str="hi mam you are amazing";
//     String s[]=new String[5];
//     s=str.split(" ");
//     // System.out.println(s.length);
//     int a[]=new int[5];
//     for(int i=0;i<s.length;i++){
//         a[i]=s[i].length();
//         // System.out.println(a[i]);
//     }
//    int min=a[0];
//    for(int j=0;j<a.length;j++){
//        if(min>a[j]){
//            min=a[j];
//        }
//    }
//    for(int k=0;k<s.length;k++){
//     if(min==s[k].length()){
//         System.out.println("min word is "+s[k]);
//   }
// }
// }
// }


// class Super{
//   public static void main(String args[]){
//   String s="hi mam you are wow";
//     String str[]=new String[5];
//     str=s.split(" ");
//     String revs="";
//     for(int i=0;i<str.length;i++){//str[0]=hii,[1]=mam,....[n]wow
//     revs="";
//     for(int j=str[i].length()-1;j>=0;j--){
//       revs=revs+str[i].charAt(j);
//     }
//     if(str[i].equals(revs)){
//       System.out.println(str[i]+" ");
//     }
//     }
//   }
// }


//the word shoud be 3 character read from user

// import java.util.*;
// class Super{
//   public static void main(String[]ars){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter 3 words");
//     String s= sc.nextLine();
//     String str[]=s.split(" ");
//     for(int i=0;i<str.length;i++){
//       if(str[i].length()==3){
//         System.out.println(str[i]);
//       }
//     }
//   }
// }

