//nullpoint Exception handling
import java.util.*;
class Nullpoint{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    name=null;
    
    try{
      System.out.println(name.length());
    }
    catch(NullPointerException e){
      System.out.println(e);
    }
    System.out.println("exception handling");
  }
  
}