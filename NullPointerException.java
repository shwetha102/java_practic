/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/

import java.util.*;
import java.io.*;

class Student {
  private String name;
  private int marks;
  private String city;

  void setName(String name) {
    this.name = name;
  }

  void setMarks(int marks) {
    this.marks = marks;
  }

  void setCity(String city) {
    this.city = city;
  }

  String getName() {
    return name;
  }

  int getMarks() {
    return marks;
  }

  String getCity() {
    return city;
  }
}

public class NullPointerException{
  public static void main(String args[]) {
    Student stu = null;
    try {
      stu.setName("shwetha");
      stu.setMarks(600);
      stu.setCity("Bangalore");
      System.out.println(stu.getName() + " " + stu.getMarks() + " " + stu.getCity());
    }

    catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Exception Handeled");
  }
}

