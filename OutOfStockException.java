/* 5. Write a program create custom Exception to manage stock. Create OutOfStockException and throw this exception if user 
     entered stock is not present while purchase products. Create the following methods.
     ==> addStock(int qty)   : write code to add stock
     ==> purchase(int qty)   : write code to purchase products
     ==> diplayStock()       : write code to display available stock

  Display list of options to user before accept option from user, such as 
  1. addStock  
  2. purchaseProduct 
  3. displayStock
*/

import java.io.*;
import java.util.*;

 

class OutofStockException extends Exception {
  public OutofStockException(String str) {
    super(str);
  }
}
class Stock{
  int id;
  String name;
  int qty;
   public void addStock(int qty){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter id");
     id=sc.nextInt();
     System.out.println("enter name");
     name=sc.next();
     this.qty=qty;    
     
   }
   public void purchase(int qty)throws OutofStockException {
     Scanner sc=new Scanner(System.in);
     if(qty==this.qty){
       System.out.println("Item purchased");
     }
     else{
       throw new OutofStockException("Stock not available");
     }
   }
  public void display() {
    System.out.println(id+" "+name+" "+qty);
  }
  public void viewOptions(){
      System.out.println("List of options");
      System.out.println("1.add stock");
      System.out.println("2.purchase Product");
      System.out.println("3.display stock");
      System.out.println("4.Exit");
      System.out.println("choose your option");
  }
}
public class OutOfStockException{
  public static void main(String args[]) {
    // OutOfStockException os = new OutOfStockException();
    Stock s=new Stock();
      Scanner sc=new Scanner(System.in);
    int option;
    do{
      s.viewOptions();
      option = sc.nextInt();
      if (option == 1) {
        s.addStock(10);
      } else if (option == 2) {
        try{
        s.purchase(20);
        }
        catch(Exception e){
          System.out.println(e);
        }
      } else if (option == 3) {
        s.display();
      } else if (option == 4) {
        System.out.println("Thank you visit again");
      } else {
        System.out.println("invalid option");
      }
    } while (option != 0);
  }
}
