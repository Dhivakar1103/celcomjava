package com.celcom.day7;
import java.util.Scanner;

class SavingAccount {
	private long balanceAccount;

	void deposit(long amount) {
		this.balanceAccount = this.balanceAccount + amount;

	}

	void withdraw(long amount) {
		this.balanceAccount = this.balanceAccount - amount;

	}

	public long getBalanceAccount(){
		return balanceAccount;
		
	}
	
}

class withdrawer extends Thread {
	SavingAccount savingAccount;

	withdrawer(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	public void run()  {
		synchronized (savingAccount) {
			System.out.println("Withdrawer is waiting for Depositor to deposit a money .. ");
			try {
				savingAccount.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Enter the amount to Withdraw : ");
			long amount = new Scanner(System.in).nextLong();
			savingAccount.withdraw(amount);
			System.out.println(amount + " Withdraw Successfully");
			System.out.println("Balance " + savingAccount.getBalanceAccount());
			
			

		}
	}


}

class depositor extends Thread {
	SavingAccount savingAccount;

	depositor(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	public void run()  {
		synchronized (savingAccount) {
			System.out.println("Depositor started depositing the money ..  ");
			System.out.println("Enter the amount to deposit ");
			long amount = new Scanner(System.in).nextLong();
			savingAccount.deposit(amount);
			
			
			System.out.println("Balance " + savingAccount.getBalanceAccount());
			savingAccount.notify();
			
			

		}
	}

}

public class SynchronizationExample2 {

	public static void main(String[] args) throws InterruptedException {
		SavingAccount obj = new SavingAccount();
		withdrawer obj2 = new withdrawer(obj);
		obj2.start();

		Thread.sleep(2000);
		depositor obj1 = new depositor(obj);

		
		obj1.start();


	}

}
