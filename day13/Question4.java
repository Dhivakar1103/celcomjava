package com.celcom.day13;

import java.util.concurrent.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Task implements Runnable {

	@Override
	public void run() {

		System.out.println("Sheduled Executor " + LocalTime.now());

	}

}

public class Question4 {

	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		for (int i = 0; i < 10; i++) {
			executor.schedule(new Task(), 1500 * i, TimeUnit.MILLISECONDS);

		}

	}

}
