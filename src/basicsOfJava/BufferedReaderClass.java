package basicsOfJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input1 = Integer.parseInt(reader.readLine());
        int input2 = Integer.parseInt(reader.readLine());
        reader.close();
        
        System.out.print(input1 + " " + input2);
	}
}
