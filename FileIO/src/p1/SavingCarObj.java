package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SavingCarObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Tesla", "Black");
		SavingCarObj s = new SavingCarObj();
		s.SaveToFile(c);
		Car m = s.ReadFromFile();
		m.display();
		

	}
	
	public void SaveToFile(Car c) {
		FileOutputStream file = null;
		ObjectOutputStream obj = null;
		try {
			file = new FileOutputStream("CarDetails.bin", true);
			obj = new ObjectOutputStream(file);
			obj.writeObject(c);
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception Caught....");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Exception Caught....");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception Caught....");
			e.printStackTrace();
		}
		finally {
			try {
			obj.close();
			file.close();
			System.out.println("In the finally block.....");
			}
			catch(Exception e){
				System.out.println("Exception caught");
			}
		}
		
	}
	public Car ReadFromFile() {
		FileInputStream file = null;
		ObjectInputStream obj = null;
		Car obj1 = null;
		try {
			file = new FileInputStream("CarDetails.bin");
			obj = new ObjectInputStream(file);
			obj1 = (Car)obj.readObject();
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception Caught....");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Exception Caught....");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception Caught....");
			e.printStackTrace();
		}
		finally {
			try {
			obj.close();
			file.close();
			System.out.println("In the finally block.....");
			}
			catch(Exception e){
				System.out.println("Excetion caught");
			}
		}
		return obj1;
	}
	

}
class Car implements Serializable{
	
	String Brand;
	String Color;
	Car(){
		
	}
	Car(String Brand, String Color){
		this.Brand = Brand;
		this.Color = Color;
	}
	
	public void display() {
		
		System.out.println("Car Brand : "+ Brand);
		System.out.println("Car Color : "+ Color);
		
	}
	
}
