//Array Exception handling
import java.util.*;
class ArrayIndex{
  public static void main(String[]args){
    int a[]={1,2,34,56};
    try{
      System.out.println(a[3]);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
  }
}
