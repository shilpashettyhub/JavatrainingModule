package Package1;

import java.util.HashMap;
import java.util.Scanner;

public class Kidnapper1 {

	public static void main(String[] args) {
         Scanner c = new Scanner(System.in);
         System.out.println("Enter the number of words in magazine and note respectively :");
         int n = c.nextInt();
         int m = c.nextInt();
         
         System.out.println("Enter the of strings in magazine ");
         String magazine[] = c.nextLine().split(" ");
         
         System.out.println("Enter the strings in note");
         String note[] = c.nextLine().split(" ");
         
         HashMap<String, Integer> hm = new HashMap<String, Integer>();
         
         for (int i=0;i<magazine.length;i++) 
         {
        	 if(hm.containsKey(magazine[i])) 
        		 hm.put(magazine[i], hm.get(magazine[i])+1);
        	 else
        		 hm.put(magazine[i], 1);	 
         }
         boolean state = false;
         for (int i=0;i<note.length;i++) 
         {
        	 if(!hm.containsKey(note[i])) 
        		 state = true;
        	 else {
        		 if(hm.get(note[i])>1)
        			 hm.put(note[i], hm.get(note[i])-1);
        	     else
        		     hm.remove(note[i]) ;
         }
        	 }
         if(state)	 
        	 System.out.println("NO");
         else
        	 System.out.println("YES");
        
         
	}

}
