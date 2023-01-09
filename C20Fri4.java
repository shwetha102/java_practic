//create class student take marks of any 3 subjects display avg of 3 students
class Student{
  int sub1;
  int sub2;
  int sub3;

  Student(int sub1,int sub2,int sub3){
    this.sub1=sub1;
    this.sub2=sub2;
    this.sub3=sub3;
  }

void display(){
  System.out.println(((sub1+sub2+sub3)/3));
}
}

class C20Fri4{
  public static void main(String[]args){
    Student st1=new Student(85,87,90);
    st1.display();
    Student st2=new Student(80,95,98);
    st2.display();
    Student st3=new Student(91,88,75);
    st3.display();
    
    
  }
}