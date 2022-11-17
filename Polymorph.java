//multiple methods have same name with different parameters(Method overloading)
/*
class Addition{

  void sum(int a,int b){
    System.out.println("Sum is "+(a+b));
  }
  
  void sum(int a,int b,int c){
     System.out.println("Sum is "+(a+b+c));
  }
   void sum(int a,float b){
     System.out.println("Sum is "+(a+b));
  }
  void sum(float a,float b){
     System.out.println("Sum is "+(a+b));
  }
   void sum(float a,int b){
     System.out.println("Sum is "+(a+b));
  }
}
class Polymorph{
  public static void main(String args[]){
  Addition add=new Addition();
    add.sum(23,45);
    add.sum(1,2,3);
    add.sum(12,34.5f);
    add.sum(34.5f,12.3f);
    add.sum(23.5f,12);
  }
}
*/

/*
class Add{
  void sum(double a,int b){
    System.out.println("sum is"+(a+b));
  }
  void sum(double a,double b){
    System.out.println("sum is"+(a+b));
  }
}
class Polymorph{
  public static void main(String args[]){
  Add ad1=new Add();
    ad1.sum(2.3d,2);
    ad1.sum(2.3d,2.5d);
  }
}
*/

// 3.Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of rectangle has two parameters which are length and breadth respetively while the other method for printing area of square has one parameter which is side of square
/*
class Area{
  void sqr(int l,int b){
    System.out.println("rectangle is"+(l*b));
  }
   void sqr(int s)
    {
        System.out.println("Area of the square is " + (s * s));
    }
}

class Polymorph{
  public static void main(String[]args){
    Area ar1=new Area();
    ar1.sqr(10,20);
    ar1.sqr(10);
  }
}
*/

//1.Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with the same name 'printn' having a parameter for each datatype.
/*
class PrintNum{
  void num(int a){
    System.out.println("number is"+a);
  }
  void num(float a){
    System.out.println("number is"+a);
  }
  void num(double a){
    System.out.println("number is"+a);
  }
  void num(char a){
    System.out.println("number is"+a);
  }
  void num(String a){
    System.out.println("number is"+a);
  }
}
class Polymorph{
  public static void main(String[]args){
    PrintNum nu=new PrintNum();
    nu.num(1);
    nu.num(2.3f);
    nu.num(1.2d);
    nu.num('b');
    nu.num("parvathi");
  }
}
*/

//2.Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
// For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
/*
class Mem{
  void seq(int a,char b){
    System.out.println("number is" +a+ "charactr is" +b);
  }
    void seq(char a,int b){
    System.out.println("charactr is" +a+ "number is" +b);
  }
}
class Polymorph{
  public static void main(String[]args){
    Mem me=new Mem();
    me.seq(2,'f');
    me.seq('f',2);
  }
}
*/

//4.Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
//Hint - Use array of objects
/*
import java.util.*;
class Student{
  String name;
  int age;
  String address;
  // constructor
  Student(){
    this.name="unknown";
    this.age=0;
    this.address="not aviable";
  }
  void setInfo(int age,String name){
    this.age=age;
    this.name=name;
  }
  void setInfo(String name,int age,String address){
    this.name=name;
    this.age=age;
    this.address=address;
  }
}
class Polymorph{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student s[]=new Student[2];
    for(int i=0;i<2;i++){
    s[i]=new Student();
    s[i].setInfo(sc.next(),sc.nextInt(),sc.next());
    }
    for(int i=0;i<2;i++){
      System.out.println(s[i].name+" "+s[i].age+" "+s[i].address);
    }
  }
}
*/

//Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes.
/*
class Degree{
  void getdegree(){
    System.out.println("I got a degree");
  }
}
class Undergraduate extends Degree{
  void getdegree(){
    System.out.println("I am an Undergraduate");
  }
}
class Postgraduate extends Degree{
  void getdegree(){
    System.out.println("I am a Postgraduate");
  }
}
class Polymorph{
  public static void main(String[]args){
    Degree degre=new Degree();
    degre.getdegree();
    Undergraduate grad=new Undergraduate();
    grad.getdegree();
    Postgraduate post=new Postgraduate();
    post.getdegree();
  }
}
*/

//A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
// Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.
/*
class Bank{
  void getbalance(){
    System.out.println("null");
  }
}
class BankA extends Bank{
  void getbalance(){
    System.out.println("bank a is $1000");
  }
}
class BankB extends Bank{
  void getbalance(){
    System.out.println("bank b is $1500");
  }
}
class BankC extends Bank{
  void getbalance(){
    System.out.println("bank c is $2000");
  }
}
class Polymorph{
  public static void main(String[]args){
    Bank ba=new Bank();
    ba.getbalance();
    BankA ba1=new BankA();
    ba1.getbalance();
    BankB ba2=new BankB();
    ba2.getbalance();
    BankC ba3=new BankC();
    ba3.getbalance();
  }
}
*/

