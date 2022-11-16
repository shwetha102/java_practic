/*
import java.util.*;
class Student{
  int rollno;
  String name;
  int marks;
  char grade;
  String branch;
  
}
class Student1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student s[]=new Student[5];
    
    for(int i=0;i<5;i++){
      s[i]=new Student();
      System.out.println("enter studentno "+(i+1)+" details");
      System.out.println("enter roll number");
      s[i].rollno=sc.nextInt();
      System.out.println("enter name");
      s[i].name=sc.next();
      System.out.println("enter marks");
      s[i].marks=sc.nextInt();
      System.out.println("enter grade");
      s[i].grade=sc.next().charAt(0);
      System.out.println("enter branch");
      s[i].branch=sc.next();

      }
    for(int i=0;i<5;i++){
      System.out.println(s[i].rollno+" "+s[i].name+" "+s[i].marks+" "+s[i].grade+" "+s[i].branch);
    }
  }
}
*/

/*
import java.util.*;
class Student3{
  int roll;
  String name;
  int marks;
  char grade;
  String branch;
  Scanner sc=new Scanner(System.in);
  void input(){
    //int i=0;
    System.out.println("enter student roll number");
    roll=sc.nextInt();
    System.out.println("enter student name");
    name=sc.next();
    System.out.println("enter student marks");
    marks=sc.nextInt();
    System.out.println("enter grade");
    grade=sc.next().charAt(0);
    System.out.println("enter branch");
    branch=sc.next();
  }
  void display(){
    System.out.println("roll number"+roll);
     System.out.println("name"+name);
     System.out.println("marks"+marks);
     System.out.println("grade"+grade);
     System.out.println("branch"+branch);
  }
}
class Student1{
  public static void main(String args[]){
    Student3 stu[]=new Student3[5];
    for(int i=0;i<5;i++){
      stu[i]=new Student3();
      stu[i].input();
    }
    for(int i=0;i<5;i++){
      stu[i].display();
    }
  }
}
*/

/*
import java.util.*;
class Student{
  int srollno;
  String sname;
  int smarks;
  char sgrade;
  String sbranch;
  Student(){
    srollno=124;
    sname="shan";
    smarks=56;
    sgrade='B';
    sbranch="ece";
  }
  Student(int rollno,String name,int marks,char garde,String branch){
    srollno=rollno;
    sname=name;
    smarks=marks;
    sgrade=garde;
    sbranch=branch;
  }
  Student(int srollno,int smarks){
    this.srollno=srollno;
    this.smarks=smarks;
  }
  Student(int srollno,String sname){
    this.srollno=srollno;
    this.sname=sname;
  }
}
  class Student1{
  public static void main(String args[]){
    Student s=new Student();
    System.out.println(s.srollno);
    System.out.println(s.sname);
    System.out.println(s.smarks);
    System.out.println(s.sgrade);
    System.out.println(s.sbranch);
    Student s1=new Student(124,"shan",56,'B',"ece");
    System.out.println(s1.srollno+" "+s1.sname+" "+s1.smarks+" "+s1.sgrade+" "+s1.sbranch);
    Student s2=new Student(125,560);
    System.out.println(s2.srollno+" "+s2.smarks);
    Student s3=new Student(126,"shan");
    System.out.println(s3.srollno+" "+s3.sname);
    
    
  }
  }
*/

/*
class Animal{
String color;
int no_legs;
String bread;
void eat(){
System.out.println("eating");
} 
void run(){
System.out.println("running");
}
}
class Dog extends Animal{
void bark(){
System.out.println("Bow Bow......");
}
void display(){
System.out.println(color +" "+no_legs+" "+bread); }
}

class Student1{
public static void main(String args[]){
Dog puppy=new Dog();
puppy.color="black";
puppy.no_legs=4;
puppy.bread="jarman shepherd";
puppy.display();
puppy.eat();
puppy.run();
puppy.bark();
}
}
*/

/*
class Animal{
String color;
int no_legs;
String bread;
void eat(){
System.out.println("eating");
} 
void run(){
System.out.println("running");
}
}
class Dog extends Animal{
void bark(){
System.out.println("Bow Bow......");
}
}
  class BabyDog extends Dog{
    void weep(){
      System.out.println("weeping......");
    }
  
void display(){
System.out.println(color +" "+no_legs+" "+bread); }
}

class Student1{
public static void main(String args[]){
BabyDog puppy=new BabyDog();
puppy.color="black";
puppy.no_legs=4;
puppy.bread="jarman shepherd";
puppy.display();
puppy.eat();
puppy.run();
puppy.bark();
puppy.weep();
}
}
*/

/*
class Animal{
String color;
int no_legs;
String bread;
void eat(){
System.out.println("eating");
} 
void run(){
System.out.println("running");
}
}
class Dog extends Animal{
void bark(){
System.out.println("Bow Bow......");
}
}

class Cat extends Animal{
  String eyecolor;
  void meow(){
    System.out.println("meow meow.....");
  }

  
void display(){
System.out.println(color +" "+no_legs+" "+bread+" "+eyecolor); }
}

class Student1{
public static void main(String args[]){
Cat puppy=new Cat();
puppy.color="black";
puppy.no_legs=4;
puppy.bread="jarman shepherd";
puppy.eyecolor="blue";
puppy.display();
puppy.eat();
puppy.run();
puppy.meow();
}
}
*/


// 1.Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

/*
class Member{
  String name;
  int age;
  long phoneno;
  String address;
  int salary;
   void printSalary(){
    System.out.println("print slary:"+salary);
  }
  
}
class Employee extends Member{
  String specialization;
  String department;
}
class Manager extends Member{
  String department;
  String specialization;
  
}

class Student1{
  public static void main(String args[]){
  Employee e=new Employee();
  e.name="shan";
  e.age=23;
  e.phoneno=9806543352l;
  e.address="asam";
  e.salary=12356;
  e.specialization="M.tech";
  e.department="Robotics";
  
 System.out.println(e.name+" "+e.age+" "+e.phoneno+" "+e.address+" "+e.salary+" "+e.specialization+" "+e.department);
     e.printSalary();
 Manager m=new Manager();
  m.name="anjali";
  m.age=18;
  m.phoneno=9806546666l;
  m.address="andra";
  m.salary=100000;
  m.specialization="B.tech";
  m.department="fullstack";

System.out.println(m.name+" "+m.age+" "+m.phoneno+" "+m.address+" "+m.salary+" "+m.specialization+" "+m.department);
    m.printSalary();
}
}
*/

// 2.Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class Print the area and perimeter of a rectangle and a square.


