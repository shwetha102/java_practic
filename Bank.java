/* 3. Write a program to create 2 threads by extending from Thread class and create synchronized method called 
      withdraw(int amt) and access withdraw( ) from Thread1 and Thread 2.   */

class Bank1{
	 int balance = 100;
	
	synchronized void withdraw(int amt) {
		if (balance >= amt) {
			try {
				Thread.sleep(1000);
			} 
      catch (InterruptedException e) {
        System.out.println(e);
				
			}
			balance =balance-amt;
			System.out.println("Withdrew " + amt + ", new balance: " + balance);
		} 
    else {
			System.out.println("Insufficient balance");
		}
	}
}

class Thread1 extends Thread {
	Bank1 bank;
	
	Thread1(Bank1 bank) {
		this.bank = bank;
	}
	
	public void run() {
		bank.withdraw(50);
	}
}

class Thread2 extends Thread {
	Bank1 bank;
	
	Thread2(Bank1 bank) {
		this.bank = bank;
	}
	
	public void run() {
		bank.withdraw(50);
	}
}

public class Bank{
	public static void main(String args[]) {
		Bank1 bank = new Bank1();
		Thread1 t1 = new Thread1(bank);
		Thread2 t2 = new Thread2(bank);
		t1.start();
		t2.start();
	}
}

