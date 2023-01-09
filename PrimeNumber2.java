//primenumber in array
import java.util.*;
class PrimeNumber2{
  public static void main(String[]args){
    int a[]={26,23,24,56,57};
    
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    for(int i=0;i<=a.length;i++){
    count=0;
      for(int j=0;j<=i;j++)
     {
          if(a[i]%j==0)
       {
       count++;
}
}
if(count==2){
System.out.println(i);
}
}
  }
}