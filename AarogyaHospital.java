//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

// the main class
public class AarogyaHospital{

	static int count=0;
// class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
  String name, gender, city,address, guardian_name;
  int age,adharNo,contact_Number,guardian_contact;
  String date_admission,guardian_address;
  boolean recoverd;
// make constructor for the class and assign it a unique Id
    int id;
	    public AarogyaMember(){
        id=count;
        count++;
        recoverd=false;
	    }
    
// for taking patient information
	    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the gender");
        gender=sc.next();
        System.out.println("Enter the adhar number");
        adharNo=sc.nextInt();
        System.out.println("Enter the contact number");
        contact_Number=sc.nextInt();
        System.out.println("Enter the city");
        city=sc.next();
        System.out.println("Enter the address");
        address=sc.next();
        System.out.println("Enter the date admission");
        date_admission=sc.next();
        System.out.println("Enter the guardian name");
        guardian_name=sc.next();
        System.out.println("Enter the guardian address");
        guardian_address=sc.next();
        System.out.println("Enter the guardian contact");
        guardian_contact=sc.nextInt();
        System.out.println("patient register"+id);
	    }
    
    public void display(AarogyaMember ar){
      System.out.println(ar.id+" "+ar.name+" "+ar.gender+" "+ar.adharNo+" "+ar.contact_Number+" "+ar.city+" "+ar.address+" "+ar.date_admission+" "+ar.guardian_name+" "+ar.guardian_address+" "+ar.guardian_contact);
    }
    
	}

// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		
          
// create scanner class to take input
    Scanner sc=new Scanner(System.in);
	    long option=sc.nextLong();
	    return option;
	}
  

	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    boolean flag=false;
    AarogyaHospital ob= new AarogyaHospital();
    AarogyaHospital.AarogyaMember ob2= ob.new AarogyaMember();
		ArrayList<AarogyaHospital.AarogyaMember> list= new ArrayList<AarogyaHospital.AarogyaMember>();
// initialise array list to store list of patients information
		
//for adding aarogya member information
		while(true){

	//take choice
			long option=choices();
			
	//invalid choice
			if(option<0||option>7){
			
			}
	// take the input and add in the arrayList
			else if(option==1){
        AarogyaHospital.AarogyaMember ob4= ob.new AarogyaMember();
        ob4.input();
        list.add(ob4);
        }
	//iterate and print all the patients information
	       		 else if(option==2){
              for(AarogyaHospital.AarogyaMember ob3:list){
                  System.out.println(ob3.name+" "+ob3.id);
              }
	       		 }
			
	// print details of the patient with a particular id (take id as input)
	                else if(option==3){
                   System.out.println("Enter the id");
                    int id=sc.nextInt();
                    for(AarogyaMember ob3:list){
                      if(ob3.id==id){
                        ob2.display(ob3);
                        flag=true;
                      }
                    }
                    if(flag=false){
                      System.out.println("patient not found based on id");
                    }
	                }
			
	// to print all the patients from a particular city (take city as input)
	                else if(option==4){
                    System.out.println("Enter the city");
                    String city=sc.next();
                    for(AarogyaMember ob3:list){
                      if(ob3.city.equals(city)){
                        ob2.display(ob3);
                        flag=true;
                      }
                    }
                    if(flag==false){
                      System.out.println("Patient not found based on city");
                    }
	               }
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
                   System.out.println("Enter the age");
                   int age=sc.nextInt();
	                for(AarogyaMember ob3:list){
                    
                    if(ob3.age==age){
                      
                      ob2.display(ob3);
                      flag=true;
                    }
                  }
                  if(flag==false){
                    System.out.println("not patient matched with this age");
                  }
	              }
	// take member id as input to maintain recovered information of patient
	               else if(option==6){
                   System.out.println("Enter the id");
                   int id=sc.nextInt();
                   for(AarogyaMember ob3:list){
                     if(ob3.id==id){
                       ob3.recoverd=true;
                       ob2.display(ob3);
                     }
                   }
	              }
//take member id as input to delete patient information
	              else if(option==7){
                  System.out.println("Enter the id");
                  int id=sc.nextInt();
                  AarogyaHospital.AarogyaMember ab=null;
                  for(AarogyaMember ob3:list){
                    if(ob3.id==id){
                     ab=ob3;
                    }
                    
                  }
                  list.remove(ab);
                  System.out.println("delete sucessfully");
	              }
			
	              else{
	             break;
	             }
		}
	}
}

		
	

