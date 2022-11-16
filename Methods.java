//4 methods using for area of rectangular
// class Methods{  
//    static void area1() 
//     {  
//     int width=5;  
//     int height=10;  
//     int area=width*height;  
//         System.out.println(area);  
//      }  
//     public static void main(String[]args){
//     area1();
// }
// }  

  
// class Methods{  
//  static int area2() 
//     {  
//     int width=5;  
//     int height=10;  
//     int area=width*height;  
//         return area;
//      }  
//      public static void main(String[]args){
//      int result=area2();
//   System.out.println(result);
// } 
// }

// class Methods{  
//     static void area3(int width,int height) 
//     {  
       
//     int area=width*height;  
//         System.out.println(area);  
//      }  
//   public static void main(String[]args){
//     area3(5,10);
//   }
// }  


// class Methods{  
//    static int area4(int width,int height) 
//     {  
        
//     int area=width*height;  
//         return area;
//      } 
//   public static void main(String[]args){
//     int result=area4(5,10);
//     System.out.println(result);
//   }
   
// } 


// //swapping two
// class Methods{
//   static void swap(){
//   int x=10;
//   int y=11;
//   int temp=x;
//   x=y;
//   y=temp;
//    System.out.println(x+"  " + y);
   
//   }
//   public static void main(String[]args){
//     swap();
//   }
//   }

// class Methods{
//   void swap(){
//   int x=10;
//   int y=11;
//   int temp=x;
//   int x=y;
//   int y=temp;
//   return x,y;
//   }
//   }

// void swap(int x,int y){
//   int temp =x;
//   int x=y;
//   int y=temp;
//   System.out.println(x+" "+y);
// }

// int swap(int x,int y){
//   int temp =x;
//   int x=y;
//   int y=temp;
//   return x,y;
// }

//adding two numbers
// class Methods{

// static void sum1(){
//   int a=10;
//   int b=20;
//   int sum=a+b;
//   System.out.println(sum);
// }
// public static void main(String[]args){
//   sum1();
// }
// }

// class Methods{

// static int sum1(){
//   int a=10;
//   int b=20;
//   int sum=a+b;
//   return sum;
// }
// public static void main(String[]args){
//   int result=sum1();
//   System.out.println(result);
// }
// }


//perfect number
// import java.util.*;
// class Methods{
//   static void perfect(){
//     Scanner sc=new Scanner(System.in);         
//      System.out.println("Enter the number");  
//      int n=sc.nextInt();  
//      int sum=0;
//     for(int i=1;i<=n/2;i++){
//       if(n%i==0){
//         sum=sum+i;
//       }
      
//     }
//     if(sum==n){
//       System.out.println("perfect number");
//     }
//     else{
//       System.out.println("not perfect number");
//     }
    
//   }
//   public static void main(String[]args){
//     perfect();
//   }
// }

class Methods{

  static int perfectNumber(int num){
    int sum=0,count=0;
    for(int i=1;i<=num/2;i++){
      if(num%i==0){
           sum=sum+i;
      }
    }
      if(sum==num){
      return 1;
      }
      else{
        return 0;
      }
  }
  
  public static void main(String args[]){
    //call the method
     int result=perfectNumber(6);
    if(result==1){
      System.out.println("perfect number");
    }
    else{
      System.out.println("not perfect");
    }
      
    
   
    }
    }
