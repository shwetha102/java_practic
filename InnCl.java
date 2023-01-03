//inner and outer class
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}
class InnCl{
    public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    OuterClass.InnerClass inner = outer.new InnerClass();
    System.out.println(inner.y + outer.x);
  }
}
