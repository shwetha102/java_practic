/*. Write a Java program to create Pojo class called Student which includes variables like Sid, name, mark
s and city. Serialize Student class and store in studentDetails.ser file using FileOuputStream and 
ObjectOutputStream. Read data from studentDetails.ser file using FileInputStream and ObjectInputStream 
classes and display student details on console.*/

 

import java.io.*;

 

class Student implements Serializable{
  int id;
  String name;
  int marks;
  String city;
  public Student(int id,String name,int marks,String city)
{ 
   this.id=id;
    this.name=name;
    this.marks=marks;
    this.city=city;

 

}
  
  
}

 

public class Student1{
  public static void main(String args[]) throws IOException,ClassNotFoundException{
   try{
    Student s=new Student(123,"poja",345,"hyderabad");
    FileOutputStream fos=new FileOutputStream("data.txt");
    ObjectOutputStream oos= new ObjectOutputStream(fos);
   
    oos.writeObject(s);
    oos.flush();
    oos.close();
   }
    catch(IOException e){
      System.out.println(e);
    }
   try{ 
    FileInputStream fis=new FileInputStream("data.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
  
    Student ds=(Student)ois.readObject();
    System.out.println(ds.id+" "+ds.name+" "+ds.marks+" "+ds.city);
   }
     catch(ClassNotFoundException e){
      System.out.println(e);
    }
   
  }
}