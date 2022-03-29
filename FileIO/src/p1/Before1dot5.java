package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Before1dot5 {
	//Reading
	public void reader() {
		BufferedReader input;
		StringTokenizer line;
		String inputLine;
		
		try {
			input = new BufferedReader(new FileReader("Ages.txt"));
			while((inputLine = input.readLine()) != null) {
				line = new StringTokenizer(inputLine, "|");
				while (line.hasMoreTokens()) {
			         System.out.println(line.nextToken());
			     }
			}
		}
		catch(IOException e) {
			System.out.println(e);
			System.exit(1);
		}

	}
	//writing
	public void writer(int n, int m, String area) {
		PrintWriter p = null;;
		try {
		p = new PrintWriter(new FileWriter("C:\\Users\\shettysh\\Desktop\\Java Projects\\FileIO\\Results.txt", true));
		p.println("Results of the survey in "+area+" :");
		p.println("Number of males : "+ n);
		p.println("Number of females: "+m);
		p.println("\n");
		}
		catch(IOException e) {
			System.out.println(e);
			System.exit(1);
		}
		finally{
			System.out.println("Closing file...");
			p.close();
		}
	}

	public static void main(String[] args) {
		Before1dot5 b = new Before1dot5();
		Scanner c = new Scanner(System.in);
		b.reader();
		System.out.println("Enter the number of records :");
		int n = c.nextInt();
		int i =1;
		System.out.println("Enter the records");
		while(i<=n) {
		System.out.println("Enter the Region: ");
		String Area = c.next();
		System.out.println("Enter the number of males: ");
		int noOfMales= c.nextInt();
		System.out.println("Enter the number of females: ");
		int noOfFemales = c.nextInt() ;
		b.writer(noOfMales, noOfFemales, Area);
		i++;
		}
	}

}
