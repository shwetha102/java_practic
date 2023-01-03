// 8.Write a Java program to read data from data.txt file and find following
// --> Frequency of each word in a file
// --> Density of each word in a file
// --> Top 3 density words
import java.io.*;
class Density{
  public static void main(String[]args) throws IOException{
    FileReader fr=new FileReader("input.txt");
    BufferedReader br=new BufferedReader(fr);
    String str;
    int count=0;
    while((str=br.readLine())!=null){
      
      String arr[]=str.split(" ");
      int fre[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
        count=1;
        for(int j=i+1;j<arr.length;j++){
          if(arr[i].equals(arr[j])){
            count++;
            fre[j]=-1;
          }
          
        }
        if(fre[i]!=-1){
         fre[i]=count; 
        }
                
      }
      for(int i=0;i<arr.length;i++){
        if(fre[i]!=-1){
          System.out.println(fre[i]+" "+arr[i]);
        }
      }
      
    }
  }
}

