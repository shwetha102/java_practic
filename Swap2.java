//write a java program to swap 2 members without variable
class Swap2{
  public static void main(String[] args){
    int a,b;
    a=10;
    b=20;
    a=a+b;  //30
    b=a-b;
    a=a-b;
    
    System.out.println("swap two number a"+a);
    System.out.println("swap two number b"+b);
  }
}