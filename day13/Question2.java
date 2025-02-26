package com.celcom.day13;

import java.util.concurrent.*;

public class Question2 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(6);
		int n =10;
		for(int i = 1 ;i<=n;i++) {
			executor.execute(() ->{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
			System.out.println("Executing task : " + Thread.currentThread());
		});
		}
			
		executor.shutdown();
	}

}
