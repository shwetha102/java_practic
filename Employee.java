/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/


import java.util.Scanner;
class Student{
//Declare the variables
  
  int Id;
  String name; 
  double salary;
  Student() { }
//Create a method getInput()
//create Scanner object
  
  Scanner sc=new Scanner(System.in);

    void getInput(){
//take input from user
   System.out.println(" Employee id"); 
   Id=sc.nextInt();
   System.out.println("Enter the name"); 
   name=sc.next();
   System.out.println("Enter the salary"); 
   salary=sc.nextDouble();
}
  //create display method
  void display() {
    //Print Employee details
   System.out.println(" Stored data displayed below ");
   System.out.println("Employee id="+Id);
   System.out.println("Enter the name="+name);
   System.out.println("Enter the salary="+salary);
   
 } 
 } 

class Employee { 
//main 
   public static void main(String args[]) { 
//creating object 
     Student st[ ]=new Student[5]; 
//check for loop to print two employee details
          for(int i=1;i<=3;i++) { 
              st[i]=new Student(); 
              //goto getInput method
  
              st[i].getInput(); 
             //goto display method
             st[i].display(); 
}
}
}