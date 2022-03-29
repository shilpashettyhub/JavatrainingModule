package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileio {
	public static void main(String[] args) {
		String fname, lname;
		int age;
		Scanner fileInput;
		File inFile = new File("C:\\Users\\shettysh\\Downloads\\Ages.txt");
		try {
			fileInput = new Scanner(inFile);
			while(fileInput.hasNext()) {
				fname = fileInput.next();
				lname = fileInput.next();
				age = fileInput.nextInt();
				System.out.println(fname+" "+lname+" is "+ age +" years old");
				System.out.println("");
			}
			fileInput.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			
		}

	}

}
