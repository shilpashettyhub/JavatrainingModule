package Designpattern;
class Singleton1{
	static int i = 0;
	private static Singleton1 s;
	private Singleton1(){
		System.out.println("Default Constructor");
	}	
	public static Singleton1 fun() {
		 i++;
		if(i == 1) {
			System.out.println("Creating a new object ");
			s = new Singleton1();
			return s;
		}
		else {
			System.out.println("Inside else block returning already created object");
	        return s;
		}	
	}
}

public class Singleton {
	

	public static void main(String[] args) {
		Singleton1 s = Singleton1.fun();
		Singleton1 s1 = Singleton1.fun();
		Singleton1 s2 = Singleton1.fun();
		

}
}