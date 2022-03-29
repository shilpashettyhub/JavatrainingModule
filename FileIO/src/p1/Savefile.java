package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Savefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1 = "Saving an Object into a file";
		Savefile s = new Savefile();
		s.savetofile(st1);
		s.readfromfile();

	}
	public void savetofile(String st){
		FileOutputStream file = null;
		ObjectOutputStream obj = null;
		try {
			Integer Intobj = new Integer(45);
			file = new FileOutputStream("abc.txt");
			obj = new ObjectOutputStream(file);
			obj.writeObject(st);
			obj.writeInt(50);
			obj.writeObject(Intobj);
		
		}
		catch(IOException e) {
			System.out.println("IO EXCEPTION OCCURED "+e);
		}
		finally {
			try {
				obj.close();
				file.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void readfromfile() {
		FileInputStream file = null;
		ObjectInputStream obj = null;
		try {
			file = new FileInputStream("abc.txt");
			obj = new ObjectInputStream(file);
			
			String st2 =(String)obj.readObject();
			int i = obj.readInt();
			Integer iobj = (Integer) obj.readObject();
			
			System.out.println("String : "+ st2+ "\nPrimitive Integer : "+ i + " \nInteger Object : " + iobj);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception ......."+e.getMessage());
		}
		finally {
			try {
				obj.close();
				file.close();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	}
}
	

