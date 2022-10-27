//Write a JAVA program to count total number of notes in given amount.

import java.util.Scanner;

class Amount{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int amount=sc.nextInt();
int fcount= amount/500;//3
amount=amount-fcount*500;//300
System.out.println("500 notes are:"+fcount);
int tcount=amount/200;//1
amount=amount-tcount*200;
System.out.println("200 notes are:"+tcount);
int hcount=amount/100;
amount=amount-hcount*100;
System.out.println("100 notes are:"+hcount);

}
}




/*import java.util.*;
class Note{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the amount");
int amt=s.nextInt();
if(amt%500==0){
System.out.println("number of 500 notes are "+amt/500);
}
else if (amt%200==0){
System.out.println("number of 200 notes are "+amt/200);
}
else if(amt%100==0){
System.out.println("number of 100 notes are "+amt/100);
}
else
System.out.println("invalid input");
}
}
*/