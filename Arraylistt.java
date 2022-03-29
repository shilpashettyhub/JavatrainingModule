package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistt {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Steve");
		list.add("Tim");
		list.add("Lucy");
		list.add("Pat");
		list.add("Angela");
		list.add("Tom");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) 
		{
			String i = it.next();
			if(i == "Steve")
			{
				it.remove();
			
			}
		}
		System.out.println(list);

	}

}
