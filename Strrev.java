//reverse string
import java.util.*;
class Strrev{
  public void Reverse(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter username");
    String str1=sc.next();
    StringBuffer str=new StringBuffer();
      str.append(str1);
    System.out.println(str.reverse());
  }
  public static void main(String args[]){
    Strrev st=new Strrev();
    st.Reverse();
  }
}