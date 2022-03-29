package Package1;

public class Binarygap {
	
	public void gap(int n) {
		int k = 0;
		String str = "";
		String str1;
		int max=0;
		boolean m = false;
		while(n>0) {
			k = n%2;
			n = n/2;
			str1 = k+"";
			str = str1.concat(str);
		}
		System.out.println(str);
		k = 0;
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			if(str.charAt(i) == '1' && m == false ) {
				m = true;
			}
			if(str.charAt(i) == '1' ) {
				System.out.println("comes here");
				if (max < k) {
					max = k;
					k = 0;
				}
			}
			if(str.charAt(i) == '0' && m == true) {
				System.out.println(k);
				k++;
			}
			
		}
		System.out.println("The gap is "+max);
		
	}

	public static void main(String[] args) {
		
		Binarygap p = new Binarygap();
		p.gap(73);

	}

}
