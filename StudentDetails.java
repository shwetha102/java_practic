/* 5. Write a Java program to accept 5 students details such as name and marks and store in studentdetails.txt file in the below format.
     Ramu, 60
     Kumar,56
     Rakesh,89
     Suresh,66
    Read data from studentdetails.txt file and print Student name and marks who got top score. 
*/

import java.util.*;
import java.io.*;

public class StudentDetails {
  public static void main(String[] args) throws IOException {
    // Create a Scanner object for reading input from the command line
    Scanner scanner = new Scanner(System.in);

    // Create a File object for the file to which we will write
    File file = new File("studentdetails.txt");

    // Create a BufferedWriter for writing to the file
    BufferedWriter writer = new BufferedWriter(new FileWriter(file));

    // Accept and store details for 5 students
    for (int i = 1; i <= 5; i++) {
      System.out.print("Enter student " + i + " name: ");
      String name = scanner.nextLine();

      System.out.print("Enter student " + i + " marks: ");
      int marks = scanner.nextInt();
      scanner.nextLine(); // consume the newline character

      // Write the student details to the file
      writer.write(name + ", " + marks);
      writer.newLine();
    }

    // Close the writer to save the file
    writer.close();

    // Find the student with the top score
    String topStudent = "";
    int topMarks = 0;

    // Create a Scanner object for reading from the file
    Scanner fileScanner = new Scanner(file);

    while (fileScanner.hasNextLine()) {
      String line = fileScanner.nextLine();
      String[] parts = line.split(", ");
      String name = parts[0];
      int marks = Integer.parseInt(parts[1]);

      if (marks > topMarks) {
        topMarks = marks;
        topStudent = name;
      }
    }
    // Print the student with the top score
    System.out.println("Top student: " + topStudent + ", marks: " + topMarks);
  }
}
