/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/

public class ArithmeticException{
  public static void divide(int a, int b) {
    // this will throw an ArithmeticException if b is 0
        System.out.println(a / b); 
    }
    public static void main(String[] args) {
        try {
          // this will throw an ArithmeticException
            divide(5, 0); 
        } 
        catch (Exception e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        }
    }

    
}
