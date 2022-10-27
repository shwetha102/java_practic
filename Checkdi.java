//check whether character is digit or not
import java.util.Scanner;
public class Checkdi{
       public static void main(String[] args) {
          
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit: ");
        char num=scanner.next().charAt(0);
      
        if(num >= '0')
        {
          if(num <'9')
          {
         System.out.println(" digit");
        }
        
        else 
        {
          System.out.println(" not a digit");
        }
        }
    }
  }