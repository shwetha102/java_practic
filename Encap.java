//
/*
class Student{
  private int rollno;
  private String name;
 
  //setters are used to assign the value
  void setRollno(int rollno){
    this.rollno=rollno;
  }
  void setName(String name){
    this.name=name;
  }

  //getters are used to print the data
  int getRollno(){
    return rollno;
  }
  String getName(){
    return name;
  }
}
class Encap{
  public static void main(String args[]){
    Student st=new Student();
    st.setRollno(1234);
    st.setName("laltha");
    System.out.println(st.getRollno()+" "+st.getName());
  }
}
*/

// class Employee-id ,name,salary use setter the getter read and display the data

class Employee{
  private int id;
  private String name;
  private int salary;

 
  // setter for assign the values
  void setid(int id){
    this.id =id;
  }
  void setname(String name){
    this.name=name;
  }
  void setsalary(int salary){
    this.salary=salary;
  }


  // getter to return the data

  int getid(){
    return id;
  }
  String getname(){
    return name;
  }
  int getsalary(){
    return salary;
  }
}


// main class and main method
class Encap{
  public static void main(String args[]){
    Employee e=new Employee();
    e.setid(123);
    e.setname("shwambi");
    e.setsalary(290000);
    System.out.println(e.getname()+" "+e.getid()+" "+e.getsalary());
  }
}