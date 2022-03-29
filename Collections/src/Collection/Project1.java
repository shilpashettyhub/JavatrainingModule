package Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
	
	public void printsize(int size) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(10);
		list.add(6);
		list.add(11);
		list.add(12);
		list.add(2);
		list.add(20);
		int min = 0;
		int mini = 0;
		for(int i=0; i<10; i++) {
			if(Math.abs(list.get(i) - size) <= min) {
				min = Math.abs(list.get(i) - size);
				mini = i;
			}
		}
		System.out.println("The closest size available is "+list.get(mini));
	}
	
	

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = c.nextInt();
		Project1 p = new Project1();
		p.printsize(4);

	}

}
