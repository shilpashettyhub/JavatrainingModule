package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(9);
		numbers.add(2);
		numbers.add(30);
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) 
		{
			Integer i = it.next();
			if(i<10)
			{
				it.remove();
				
			}
		}
		System.out.println(numbers);
	}

}
