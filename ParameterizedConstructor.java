/* 5. Write a Java program to demonstrate that objects created inside a method will becomes eligible for gc after method execution terminate. 
     Use parameterized constructor to receive the objects.*/

public class ParameterizedConstructor {
  Object object;

  ParameterizedConstructor(Object obj) {
    this.object = obj;
  }

  public void display() {
    System.out.println("Object created");
  }

  public void finalize() {
    System.out.println("Object got garbage collected");
  }

  public static void main(String[] args) {
    Object obj1 = new Object();
    ParameterizedConstructor pc = new ParameterizedConstructor(obj1);
    pc.display();
    // the object is no longer being used, it is garbage collected
    pc = null;
    System.gc();
  }
}
