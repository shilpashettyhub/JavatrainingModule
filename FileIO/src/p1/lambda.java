package p1;
interface StringFunction{
	String run(String str);
}
interface operations{
	int run(int a, int b) ;
}
public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFunction ask = (s) -> s+"?";
		StringFunction exclaim = (s) -> s+"!";
		
		PrintFormatted("Hello", exclaim);
		PrintFormatted("Hello", ask);
		
		operations sum = (a, b) -> a+b;
		operations multiply = (a, b)->a*b;
		
		operation(3,4,sum);
		operation(3,4,multiply);
		
		

	}
	public static void operation(int a, int b, operations o) {
		int result = o.run(a, b);
		System.out.println(result);
	}
	public static void PrintFormatted(String str,StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}

}
