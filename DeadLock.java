/* 4. Write a program to create two Threads by extending from Thread class. And create two file like abc.txt file and xyz.txt file.
    • Thread1 should read data from abc.txt then it should read data from xyz.txt file and display on console.  
    • Thread2 should read data from xyz.txt then it should read data from abc.txt file and display on console.
    Create two synchronized blocks to achieve dead lock.  
*/

import java.io.*;

class Thread1 extends Thread {
	public void run() {
		synchronized (this) {
			try {
        FileReader fr=new FileReader("abc.txt");
				BufferedReader br = new BufferedReader(fr);
				String str;
				while ((str = br.readLine()) != null) {
					System.out.println(str);
				}
				br.close();
				
				Thread.sleep(1000);
				FileReader fr1=new FileReader("xyz.txt");
				BufferedReader br1 = new BufferedReader(fr1);
				
				while ((str = br1.readLine()) != null) {
					System.out.println(str);
				}
				br1.close();
			} 
      catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		synchronized (this) {
			try {
        FileReader fr1=new FileReader("xyz.txt");
				BufferedReader br1 = new BufferedReader(fr1);
				
				String str;
				while ((str = br1.readLine()) != null) {
					System.out.println(str);
				}
				br1.close();
				
				Thread.sleep(1000);
				FileReader fr=new FileReader("abc.txt");
				BufferedReader br = new BufferedReader(fr);
				
				while ((str = br.readLine()) != null) {
					System.out.println(str);
				}
        br.close();
      }
      catch (Exception e){
        System.out.println(e);
      }
    }
  }
}

public class DeadLock{
	
	public static void main(String[] args) {
		Thread thread1 = new Thread1();
		Thread thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
	}
}

