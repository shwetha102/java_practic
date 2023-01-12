/* 2. Write a program to accept basic salary from user and find gross salary. Gross_Salary = basic+DA+HRA.  
      DA is 82% on basic and HRA is 70% on basic.  Use setter and getter methods to set and get values. 
      After printing gross salary display user defined message once object got garbage collected.

      Sample Input:
      Enter Basic salary: 23000
      
      Expected Output:
      Your gross salary is: 57960
      Object is garbage collected
*/


import java.util.*;

public class GrossSalary {
    private int basicSalary;
    private int da;
    private int hra;
    private int grossSalary;

    GrossSalary(int basicSalary) {
        this.basicSalary= basicSalary;
                
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
        
    }

    public int getGrossSalary() {
        return grossSalary;
    }
  public void display(){
        int da = (82 * basicSalary)/100;
        int hra = (70 * basicSalary)/100;
        int grossSalary = basicSalary + da + hra;
    System.out.println("Your gross salary is:"+grossSalary);
  }

    public void finalize(){
        System.out.println("Object got garbage collected.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int basicSalary = sc.nextInt();
        GrossSalary salary = new GrossSalary(basicSalary);  
        salary.display();
        salary = null; 
        System.gc(); 
    }
}


