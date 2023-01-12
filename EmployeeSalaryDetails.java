/* 3. Write a program to accept employee salary and 3 shopping bills, find how much % of amount 
      employee is spending on shopping on his/her salary. After printing % details, create another 
      reference variable for Employee object and clone employee object. Use setter and getter methods to set and get values. 
      Display user defined message once employee object got garbage collected.

      Sample Input: 
      Enter your salary: 10000
      Enter shopping bill1: 2000 
      Enter shopping bill2: 1400
      Enter shopping bill3: 500

      Expected Output:
      39 % of amount you are spending on shopping in your salary.
      Object got garbage collected.
*/


import java.util.*;

public class EmployeeSalaryDetails {
    private int salary;
    private int shoppingBill1;
    private int shoppingBill2;
    private int shoppingBill3;
    private int totalShoppingAmount;

    EmployeeSalaryDetails(int salary, int shoppingBill1, int shoppingBill2, int shoppingBill3) {
        this.salary = salary;
        this.shoppingBill1 = shoppingBill1;
        this.shoppingBill2 = shoppingBill2;
        this.shoppingBill3 = shoppingBill3;
        this.totalShoppingAmount = shoppingBill1 + shoppingBill2 + shoppingBill3;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setShoppingBill1(int shoppingBill1) {
        this.shoppingBill1 = shoppingBill1;
    }

    public void setShoppingBill2(int shoppingBill2) {
        this.shoppingBill2 = shoppingBill2;
    }

    public void setShoppingBill3(int shoppingBill3) {
        this.shoppingBill3 = shoppingBill3;
    }

    public int getTotalShoppingAmount() {
        return shoppingBill1 + shoppingBill2 + shoppingBill3;
    }

    public void calculatePerSalary() {
        int percentage = (getTotalShoppingAmount() *100) / salary;
        System.out.println("your salary is spent on shopping "+percentage+"%");
    }

    public void finalize(){
        System.out.println("Object got garbage collected.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter shopping bill 1: ");
        int shoppingBill1 = sc.nextInt();
        System.out.print("Enter shopping bill 2: ");
        int shoppingBill2 = sc.nextInt();
        System.out.print("Enter shopping bill 3: ");
        int shoppingBill3 = sc.nextInt();
        sc.close();

      EmployeeSalaryDetails employee = new EmployeeSalaryDetails(salary, shoppingBill1, shoppingBill2, shoppingBill3);
        employee.calculatePerSalary();
        
        employee = null; 
        System.gc(); 
    }
}
