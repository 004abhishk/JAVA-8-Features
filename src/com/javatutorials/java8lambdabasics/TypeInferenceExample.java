package com.javatutorials.java8lambdabasics;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		/*this is the implementation of StringLengthLambda interface which has been 
		 * assigned to a variable lenthLambda of interface type. Here x would be any 
		 * variable and complier will consider that as a String this is the inference*/
		StringLengthLambda lenthLambda =  x -> x.length();
		int length = lenthLambda.getLength("Hello Abhishek");
		System.out.println(length);
		
		/* we can directly print the above */
		System.out.println("Length of String is "+lenthLambda.getLength("Hello Abhishek"));
		
		/* Another way to do this */
		getLambda(lenthLambda);
		
	}
	
	public static void getLambda(StringLengthLambda l) {
		System.out.println("Length from function " + l.getLength("This is function length"));
	}

}

interface StringLengthLambda {
	public int getLength(String s);
}
