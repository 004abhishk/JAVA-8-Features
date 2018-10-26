package com.javatutorials.java8lambdabasics;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		//instance of Greeter class which accepts the Action(interface with perform method)
		Greeter greeter = new Greeter();
		//instance of HelloGreeting class just to define the Action (perform from Greeting interface)
		Greeting greeting = new HelloGreeting();
		//Call of the greet method for Action
		greeter.greet(greeting);
		
		/*Above thing is achievable with anonymous inner class if we don't want to write a 
		 * separate implementation class HelloGreeting.java  */
		Greeting anonymousGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello world from Anonymous class 7!");
				
			}
		};
		greeter.greet(anonymousGreeting);
		
		/*Above thing is achievable by replacing in line class implementation with Lambda expression */
		Greeting myLambdaFunction1 = () -> System.out.println("Hello world using Lambda.");
		greeter.greet(myLambdaFunction1);
		
		//LambdaInterface myLambdaFunction = () -> System.out.println("Hello world using Lambda.");
		//greeter.greet(myLambdaFunction);
	}

}

interface LambdaInterface{
	void foo();
}
