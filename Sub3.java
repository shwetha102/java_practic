//write java program to find the percentage of  subjects
class Sub3{
  public static void main(String args[]) {
    int eng, math, hindi;
    eng = 90;
    math = 80;
    hindi = 90;
    double total = eng + math + hindi;
    double percantage = (total / 300) * 100;
    System.out.println(percantage + "%");
  }
}