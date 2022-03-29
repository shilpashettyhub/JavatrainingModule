package Package1;

import java.util.Scanner;
public class StrToArr {
	
	public void arr(String g) {
		char arr[] = new char[g.length()] ;
		System.out.println("The char array is ");
		for(int i = 0;i<g.length();i++) {
			arr[i] = g.charAt(i);
			System.out.println(arr[i]);
		}
		
		
	}

	public static void main(String[] args) {
		StrToArr a = new StrToArr();
		Scanner c = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String g = c.nextLine();
		a.arr(g);

	}

}
