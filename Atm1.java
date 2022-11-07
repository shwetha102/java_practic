//atm code
//ATM Operation

/*
Enter pin
1234
4 digit pin
if it is valid display  bellow options

1.Withdraw
2.Deposit
3.check balance
5.exit

select option
1
if pin is not valid

display message "Invalid pin"

Do you want try again

y

Enter pin
1234
if it is valid display  bellow options

1.Withdraw
2.Deposit
3.check balance
5.exit

if pin is not valid

Do you want try it again
N
  */

/*
import java.util.*;
class Atm{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    char ch;
    do{
      System.out.println("Enter pin");
    int Apin=s.nextInt();//1234
    int count=0;
    
   while(Apin>0){
      count++;
      Apin=Apin/10;
    }
    if(count==4){
      int amount = 10000;
      System.out.println("1.Withdraw\n2.Deposit\n3.Check balance\n4.Exit ");
      System.out.println("Select option");
      int select_opt=s.nextInt();
      if(select_opt==1){
        System.out.println("Enter the amount to withdraw");
        int new_amount = s.nextInt();
        amount = amount - new_amount;
        System.out.println("withdraw successfully");
        
      }
      else if(select_opt==2){
        System.out.println("Enter the amount you wan to depoist");
        int new_amount1 = s.nextInt();
        amount = amount + new_amount1;
        System.out.println("Deposit successfully ");
      }
      else if(select_opt==3){
        System.out.println("total amount is ");
      }
       else if(select_opt==4){
      System.out.println(" Thanks for visit");
       }
    }
    else{
      System.out.println("Incorrect pin");
    }
    
    System.out.println("Do you want search again");
    ch=s.next().charAt(0);
    }while(ch=='y');
      
    
  }
}

*/

import java.util.*;
class Atm{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    char ch;
    do{
    System.out.println("enter pin");
    int Apin=sc.nextInt();
    int count=0;
    while(Apin>0){
      count++;
      Apin=Apin/10;
    }
    if(count==4){
        
    int amount = 386786;
    System.out.println("Select option");
    System.out.println("1 for Withdraw\n2 for Deposit\n3 for Check balance\n4 for Exit");
    
    int select_opt= sc.nextInt();
    switch (select_opt) {
      case 1:
        System.out.println("Enter the amount to Withdraw");
        int new_amount = sc.nextInt();
        amount = amount - new_amount;
        System.out.println("Withdraw successfully");
        break;
        case 2:
        System.out.println("Enter the amount to deposit");
        int new_amount1 = sc.nextInt();
        amount = amount + new_amount1;
        System.out.println("Deposit successfully");
        break;
      case 3:
        System.out.println("the total amount is " + amount);
        break;
      case 4:
        System.out.println("thank you");
      
    }
    }
      else{
        System.out.println("Incorrect pin");
      }
            
     System.out.println("Do u want to search again");
      ch=sc.next().charAt(0);
    }while(ch=='y');
  }
}