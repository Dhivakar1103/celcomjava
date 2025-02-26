package com.celcom.day13;
 
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
class Task12 implements Callable{
 
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		
		return sum;
		
	}
	
}
 
public class Question5 {
 
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Future result;
		
		ExecutorService execute=Executors.newFixedThreadPool(3);
		
		result=execute.submit(new Task12());
		
		System.out.println(" Sum of the natural number : "+result.get());
	}
 
}
 
 