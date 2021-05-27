package dataStructure;

import java.util.Scanner;

// Taking array elements and reversing an array
public class ReversingArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] input = new int[n];
		
		// taking the input of array
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			input[i] = num;
		}
		scanner.close();
		
		// reversing an array
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(input[i]);
		}
	}
}
