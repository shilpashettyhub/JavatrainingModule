package Package1;

public class Kidnaper {
    int a = 0;
    private static int t = 0;
    
   
	public static void main(String[] args) {
		Kidnaper k1 =  new Kidnaper();
		Kidnaper k2 =  new Kidnaper();
		Kidnaper c;
		c = k2;
		
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		
		System.out.println(k1.equals(k2));
		System.out.println(k2.equals(c));
		
		
		String s = "Shilpa";
		String s2 = "Shilpa";
		System.out.println(s2.equals(s));
		if( s == s2) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	     
		String s1 = new String("Shilpa");
		String s11 = new String("Shilpa");
		System.out.println(s1.equals(s11));
		if( s1 == s11) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
     
		
		k1.t= 5;
		System.out.println(k1.t);
		
     
	}

}
