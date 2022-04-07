package hackerrank.algorithms;

import java.util.Scanner;

public class SolveMeFirstSolution {
	
	public static void main (String ...args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = solveMeFirst (a , b);
		System.out.println("sum -> " + sum);
		scanner.close();
	}
	
	//This method is static because we are calling it from main method which is 
	//static and static method cannot call non static method.
	static int solveMeFirst (int a , int b) {
		return a + b;
	}

}
