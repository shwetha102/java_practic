// Write a Java program to read data from data.txt file using BufferedReader class and find frequency of given word in a file.

// Sample Input:
// Enter word to find frequency: bitLabs

// Expected Output :
// bitLabs frequency is : 14
import java.util.*;
import java.io.*;
public class Frequency{
  public static void main(String args[]) throws IOException{
    FileReader fis = new FileReader("data.txt");
    BufferedReader br = new BufferedReader(fis);
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the word to search for ");
    String str3 = s.next();
    //String str=null;
    String str1="";
    int count =0;
    try{
       while((str1=br.readLine())!=null){
        //System.out.println(str1);
      String word[]=str1.split(" ");
      for(int i=0;i<word.length;i++){
       // System.out.println(word[i]);
        if(str3.equals(word[i])){
           count++;
        }
      }
    }
      if(count==0){
        System.out.println("The Word not found");
      } else{
        System.out.println("The Frequency of "+str3+" will be: "+count);
      }
    
    }
   catch(IOException e){
      System.out.println(e);
   }
    br.close();
  }
}