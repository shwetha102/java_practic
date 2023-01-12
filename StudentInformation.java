/* 1. Write a program to accept 3 Students information with name, five subject’s marks and print name along with total marks. 
      Use setter and getter methods to set and get values. After displaying student total marks, assign null value to reference 
      variable and Display user defined message once student object got garbage collected.

      Sample Input: 
      Enter student1 name: Ramesh
      Enter 5 subjects marks: 34, 56, 78, 89, 99
      Enter student1 name: Rakesh
      Enter 5 subjects marks: 99, 50, 70, 84, 23
      Enter student1 name: Satish
      Enter 5 subjects marks: 34, 33, 22, 22, 10

      Expected Output:
      Total marks of Ramesh is: 356
      Object got garbage collected

      Total marks of Rakesh is: 321
      Object got garbage collected

      Total marks of Satish is: 121
      Object got garbage collected
*/

import java.util.*;

public class StudentInformation {
  private String name;
  private int marks1;
  private int marks2;
  private int marks3;
  private int marks4;
  private int marks5;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setMarks1(int marks1) {
    this.marks1 = marks1;
  }
  
  public void setMarks2(int marks2) {
    this.marks2 = marks2;
  }
  
  public void setMarks3(int marks3) {
    this.marks3 = marks3;
  }
  
  public void setMarks4(int marks4) {
    this.marks4 = marks4;
  }
  
  public void setMarks5(int marks5) {
    this.marks5 = marks5;
  }
  
  public String getName() {
    return name;
  }
  
  public int getMarks1() {
    return marks1;
  }
  
  public int getMarks2() {
    return marks2;
  }
  
  public int getMarks3() {
    return marks3;
  }
  
  public int getMarks4() {
    return marks4;
  }
  
  public int getMarks5() {
    return marks5;
  }
  
  public void finalize() {
    System.out.println("Object got garbage collected");
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int n = s.nextInt();
    StudentInformation[] students = new StudentInformation[n];
    
    for (int i = 0; i < students.length; i++) {
      students[i] = new StudentInformation();
      System.out.println("Enter the student name:");
      students[i].setName(s.next());
      System.out.println("Enter the 5 subject marks:");
      students[i].setMarks1(s.nextInt());
      students[i].setMarks2(s.nextInt());
      students[i].setMarks3(s.nextInt());
      students[i].setMarks4(s.nextInt());
      students[i].setMarks5(s.nextInt());
    }
    
    for (int i = 0; i < students.length; i++) {
      System.out.println("Total marks of " + students[i].getName() + " " + "is :" + (students[i].getMarks1() + students[i].getMarks2() + students[i].getMarks3() + students[i].getMarks4() + students[i].getMarks5()));
      students[i] = null;
      System.gc();
      System.runFinalization();
    }
  }
}

