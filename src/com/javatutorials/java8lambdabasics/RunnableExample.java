package com.javatutorials.java8lambdabasics;

public class RunnableExample {

	public static void main(String[] args) {
		
		/* instead creating a new implementation class, created the inner class*/
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread from anonymous thread class.");
				
			}
			
		});
		myThread.run();
		
		/* implementation of runnable interface using Lambda expression */
		Thread lambdaThread = new Thread(() -> System.out.println("Thread using Lambda expression"));
		lambdaThread.run();
	}

}
