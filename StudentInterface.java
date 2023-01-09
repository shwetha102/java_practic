//create interface and method should contain insert and display methods
// insert method - inser student details'
// display method - display student details
import java.util.*;

class StudentInterface{
  String name;
  int marks;
  int id;
  StudentInterface(String name,int marks,int id){
    this.name=name;
    this.marks=marks;
    this.id=id;
  }
}
interface Studentdetails{
  public void insertMethod(ArrayList<StudentInterface> al);
  public void displayMethod(ArrayList<StudentInterface> al);
  
  
}
class Test implements Studentdetails{
 
  public void insertMethod(ArrayList<StudentInterface> al){
    al.add(new StudentInterface("Vinay",500,2233));
    System.out.println("Inserted Successfully");
  
  }
public void displayMethod(ArrayList<StudentInterface> al){

 

  for(StudentInterface k:al){
    System.out.println((k.name+" "+k.marks+" "+k.id));
  }

 

}
  
  public static void main(String args[]){
    char ch=0;
    ArrayList<StudentInterface> al = new ArrayList<StudentInterface>();
    Studentdetails sd = new Test();
    Scanner sc = new Scanner(System.in);
    do{
    System.out.println("1.Insert Method");
    System.out.println("2.Display Method");
    System.out.println("Enter the option to perform");
    int option = sc.nextInt();
    
      switch(option){
      case 1:
        sd.insertMethod(al);
          
        break;
        case 2:
        sd.displayMethod(al);
        
        break;
    }
      System.out.println("Do you wish to continue(y/n)");
      ch =sc.next().charAt(0);
    }while(ch=='y');
    System.out.println("Thank you");
  }
}