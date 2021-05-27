package basicsOfJava;

import java.util.Scanner;

// Java Stdin and Stdout
// Standard Input and Standard Output - Input Stream and Output Stream
public class StdinAndStdout {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// taking the input as a single line input
		String input = scanner.nextLine();
		scanner.close();
		
		// Split or divide a string into the array of sub-string
		String[] nums = input.split(" ");
		
		// taking the value of array of sub-string one by one
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		
		// Printing to the output
		System.out.println(num1);
		System.out.println(num2);
	}
}
