//Number formate Exception
import java.util.*;
class Numberf{
  public static void main(String args[]){
  String pwd="asfg@123";
    //NumberFormatException
    try{
       System.out.println(Integer.parseInt(pwd));
    }   
    catch(NumberFormatException e){
      System.out.println(e);
     
    }
  System.out.println("Exception handled");
   
    
  }
}