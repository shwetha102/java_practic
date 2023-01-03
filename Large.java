// Imagine you are building a program that processes and stores data from a large number of text files. You want to ensure that the program is able to handle files of any size, but you also want to be notified if a file is unusually large. You could create a custom exception called LargeFileException that is thrown when the size of a file exceeds a certain threshold. 
import java.util.*;

class LargeFileException extends Exception {
    public LargeFileException(String str) {
        super(str);
    }
}
class Large{
  public static void main(String[]args) throws LargeFileException{
       long file=10000l;
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the file: ");
        int fileSize = sc.nextInt();
    if (fileSize > file) {
   
            throw new LargeFileException("File size exceeds the threshold.");
      
        }

    
  }
}

import java.io.*;

// Custom Exception
class LargeFileException extends Exception {
    public LargeFileException(String message) {
        super(message);
    }
}

// Main class
class Large {
    // Final length of text file
    long fileSizeThreshold = 1000L;

    public void process(String filePath) throws LargeFileException {
        File file = new File(filePath);
        long size = file.length();
        if (size > fileSizeThreshold) {
            throw new LargeFileException("File size exceeded threshold: " + fileSizeThreshold + " bytes");
        }

        // Process and store data from the file
    }

    public static void main(String[] args) {
        try {
            Large la = new Large();
            la.process("data.txt");
        } catch (LargeFileException e) {
            System.out.println(e.getMessage());
        }
    }
}


//custom exception for name should be greaterthn 5 char invalid exception.
//custom exception marks should be lessthan 200 invalid marks
//read data from file we need to read sname and marks check two exceptions then we can print data.