//check whether character is digit or not
import java.util.*;
class Charcter{
  public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the digit");
    char ch=sc.next().charAt(0); 
    if(ch>='0' && ch<='9'){
      System.out.println("digit");
    }
    else{
      System.out.println("not");
    }
  }
}