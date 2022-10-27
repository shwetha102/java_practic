// Write a JAVA program to input basiJAVAsalary of an employee and calculate its Gross     salary according to following: 

    //BasiJAVASalary <= 10000 : HRA = 20%, DA = 80% 

    //BasiJAVASalary <= 20000 : HRA = 25%, DA = 90% 

   // BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
import java.util.Scanner; 
public class GrossSa{ 
  public static void main(String[] args) { 
    Scanner s=new Scanner(System.in); 
    System.out.println("Enter your basic salary: "); 
    int basic=s.nextInt(); 
    if(basic<=10000){ 
      int hra=(20*basic)/100; 
      int da=(80*basic)/100; 
      int gs=basic+hra+da; 
    System.out.println("your gross salary is: "+gs); 
    } 
    if(basic<=20000){ 
      int hra =(25*basic)/100; 
      int da=(90*basic)/100; 
      int gs=hra+basic+da; 
      System.out.println("your gross salary is: "+gs); 
    } 
    if(basic>20000){ 
      int hra=(30*basic)/100; 
      int da=(95*basic)/100; 
      int gs=hra+da+basic; 
      System.out.println("your gross salary is: "+gs); 
    } 
  } 
}