//age and weight
class Ageweit{
  public static void main(String args[]) {
    int age=17,weight=44;
    if(age>18){
      if(weight>50){
        System.out.println("Eligible for blood donation");
      }
      else{
        System.out.println("under weight");
      }
    }
    else{
      System.out.println("under age");
      
    }
    
  }
}