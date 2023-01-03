/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/

import java.util.Scanner;

public class ArithmeticException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int x = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int y = scanner.nextInt();
    System.out.print("Enter the operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    switch (operator) {
      case '+':
        System.out.println(x + y);
        break;
      case '-':
        System.out.println(x - y);
        break;
      case '*':
        System.out.println(x * y);
        break;
      case '/':
        try {
          System.out.println(x / y);
        } catch (ArithmeticException e) {
          System.out.println("Cannot perform division by zero.");
        }
        break;
      default:
        System.out.println("Invalid operator.");
    }
  }
}
