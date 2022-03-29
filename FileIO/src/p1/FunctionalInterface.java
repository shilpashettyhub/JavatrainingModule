package p1 ;

import java.util.ArrayList;

public class FunctionalInterface {
	

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		
		
		IntPredicates filter=(n)->((n%2)!=0);
		
		ArrayList<Integer> odds = new ArrayList<Integer>();
		
		for(int i =0;i<numbers.size();i++) {
			if(operation(numbers.get(i), filter))
				odds.add(numbers.get(i));
		}
		
		for(int i=0;i< odds.size();i++) {
			System.out.println(odds.get(i));
		}
	}
	public static boolean operation(int n, IntPredicates k) {
		boolean result = k.isOdd(n);
		return result;
	}

}
interface IntPredicates{
	boolean isOdd(int n);
}



