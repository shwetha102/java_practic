// 6. Write a Java program to read data from Tech_mentors_details.txt, softskills_mentors_details and store in to Mentors_details.txt file using FileInputStream and FileOutputStream classes.
import java.io.*;
class Mentors{
  public static void main(String args[])throws IOException{
  FileInputStream techMentors=new FileInputStream("TechMentors.txt");
  FileInputStream softskillsMentors=new FileInputStream("SoftskillsMentors.txt");
  FileOutputStream mentorsDetails=new FileOutputStream("MentorsDetails.txt");
  int i;
  while((i=techMentors.read())!=-1){
    mentorsDetails.write(i);
    
  }
    mentorsDetails.write('\n');
    techMentors.close();
    while((i=softskillsMentors.read())!=-1){
    mentorsDetails.write(i);
  
  }
  }

 

}