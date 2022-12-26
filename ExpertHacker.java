/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/


import java.util.*;
class BankAccount { 
//declare account_number , account_balance
private long BankAccountNumber;
private float CurrentBalance;

//create getters and setters
  public void setBankAccountNumber(long newvalue)
{
    BankAccountNumber=newvalue;
}
public void setCurrentBalance(float newvalue)
{
    CurrentBalance=newvalue;
}
public long getBankAccountNumber()
{
    return BankAccountNumber;
}
public float getCurrentBalance()
{
    return CurrentBalance;
}
   
}  

public class ExpertHacker  { 
  
//main method
public static void main(String args[]) {  

//create Scanner object
Scanner sc=new Scanner(System.in);

//Take input from user
System.out.println("Enter BankAccount Number");
long i=sc.nextLong();
System.out.println("Enter Current Balance");
float j=sc.nextFloat();

//Create an object of BankAccount class and set account_number and the account_balance
  BankAccount obj=new BankAccount();

// Try accessing fields of BankAcccount class and check whether it's accessible 
  obj.setBankAccountNumber(i);
  obj.setCurrentBalance(j);

// or not. If not then try accessing it with it’s setter and getter methods.
  System.out.println("BankAccount Number"+obj.getBankAccountNumber());
  System.out.println("Current Balance"+obj.getCurrentBalance());

// Print account_number and account_balance 

}   

} 

//Good
