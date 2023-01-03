//Arithmetic exception
// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   int a,b;
//     Scanner sc=new Scanner(System.in);
//     a=sc.nextInt();
//     b=sc.nextInt();
//     System.out.println((a/b));
//     System.out.println(a);
//     System.out.println(b);
//   }
// }


// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   int a,b;
//     Scanner sc=new Scanner(System.in);
//   String name=null;
//     //NullPointerException
//     System.out.println(name.length());
    
//   }
// }


// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   int a[]={23,45,67,89};
//     //ArrayIndexOutOfBoundsException:
//     System.out.println(a[5]);
    
//   }
// }


// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   String pwd="admin@123";
//     //NumberFormatException
//     System.out.println(Integer.parseInt(pwd));
    
//   }
// }


// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   String pwd="admin@123";
//     //NumberFormatException
//     try{
//        System.out.println(Integer.parseInt(pwd));
//     }   
//     catch(Exception e){
//       System.out.println(e);
     
//     }
//   System.out.println("Exception handled");
   
    
//   }
// }

// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   String pwd="admin@123";
//     //NumberFormatException
//     try{
//        System.out.println(Integer.parseInt(pwd));
//     }   
//     catch(Exception e){
      
//       System.out.println("Output from printStackTrace() ");
//       e.printStackTrace();
 
//       System.out.println("Output from Exception reference varaiable");
//       System.out.println(e);
 
//       System.out.println(e.getMessage());
 
//       System.out.println(e.toString());
     
//     }
//   System.out.println("Exception handled");
   
    
//   }
// }

// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   String pwd="123";
//     int div;
//     //NumberFormatException
//     try{
//        System.out.println(Integer.parseInt(pwd));
//       div=23/10;
//       int arr[]={12,34,56,78};
//       System.out.println(arr[8]);
//     }  
//     catch(ArithmeticException e){
//       e.printStackTrace();
  
//     }
//     catch(NumberFormatException e){
//       e.printStackTrace();
//     }
//     catch(Exception e){
//       e.printStackTrace();
//     }
    
    
//   System.out.println("Exception handled");
   
    
//   }
// }

// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   String pwd="123";
//     int div;
//     //NumberFormatException
//     try{
//        System.out.println(Integer.parseInt(pwd));
//       try{
//          div=23/10;
//       int arr[]={12,34,56,78};
//       System.out.println(arr[8]);
//       }
//      catch(ArithmeticException e){
//       e.printStackTrace();
  
//     }
//     catch(NumberFormatException e){
//       e.printStackTrace();
//     }
//       catch(Exception e){
//       e.printStackTrace();
//     }
//     }  
//     catch(Exception e){
//       e.printStackTrace();
//     }
    
    
    
//   System.out.println("Exception handled");
   
    
//   }
// }

// import java.util.*;
// class Demo{
//   public static void main(String args[]){
//   String pwd="2123";
//     int div;
//     //NumberFormatException
   
//    try{
//       System.out.println(Integer.parseInt(pwd));
//      }
//      catch(Exception e){
//        e.printStackTrace();
//      }
  
//     finally{
//       System.out.println("finally block executed");
//     }
    
//     System.out.println("Exception handled");
    
    
    
    
//   }
// }

//The Java throw keyword is used to throw an exception explicitly.We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.

// import java.util.*;
// class Demo{
 
//   public static void validate(int age){
//     if(age>18){
//       System.out.println("Eligible");
//     }
//     else{
//       throw new NumberFormatException("under age");
//     }
//   }
//   public static void main(String args[]){
// try{
//     validate(12);
// }
// catch(Exception e){
// // e.printStackTrace();
//   System.out.println(e.getMessage());
// }
  
    
    
//   }
// }

// import java.util.*;
// class Demo{
 
//   public static void mobileValidation(String mobile){
//     if(mobile.length()==10){
//       System.out.println("Vaild mobile number");
//     }
//     else{
//       throw new ArithmeticException("Invalid Mobile number");
//     }
//   }
//   public static void main(String args[]){
// try{
//     mobileValidation("986756342");
// }
// catch(Exception e){
// // e.printStackTrace();
//   System.out.println(e.getMessage());
// }
   
    
//   }
// }


// import java.util.*;
// import java.io.*;
// class InvalidAgeException extends Exception{
//   public InvalidAgeException(String str){
//     super(str);
//   }
// }
 
// class Demo{
 
//   public static void ageValidation(int age) throws InvalidAgeException{
//     if(age>18){
//       System.out.println("Eligible");
//     }
//     else{
//       throw new InvalidAgeException("Under age");
//     }
//   }
//   public static void main(String args[]){
// try{
//     ageValidation(12);
// }
// catch(InvalidAgeException e){
// // e.printStackTrace();
//   System.out.println(e.getMessage());
// }
  
    
    
//   }
// }


// import java.util.*;
 
// class InvalidMobileNumberException extends Exception{
//   public InvalidMobileNumberException(String str){
//     super(str);
//   }
// }
 
// class Demo{
 
//   public static void MobileValidation(String mobile) throws InvalidMobileNumberException{
//     if(mobile.length()==10){
//       System.out.println("valid mobile number");
//     }
//     else{
//       throw new InvalidMobileNumberException("Invalid Mobile number");
//     }
//   }
//   public static void main(String args[]){
// try{
//     MobileValidation("22234");
// }
// catch(Exception e){
// // e.printStackTrace();
//   System.out.println(e.getMessage());
// }
  
    
    
//   }
// }

//* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers.Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"

// 3. Write a program which will illustrate ArrayIndexOutOfBoundsException.
//Create an array variable with n size, accept values from user and store values into array, finally print all values on console.Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"

//4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.Create a method which can take student class as a parameter and print name, marks and city in method business logic.Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"

//2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbersusing next() method of scanner class. Convert into numerical values and print addition of two numbers.Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"


 