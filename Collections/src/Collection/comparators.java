package Collection;

import java.util.*;
class Student implements Comparable<Student>{
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	public int compareTo(Student st){  
		System.out.println("Inside compareTo method ");
		return this.age - st.age;  
		}  
}
class AgeComparator implements Comparator{


	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.age - s2.age;
	}}
class RollNoComparator implements Comparator{


	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.rollno - s2.rollno;
	}}
public class comparators {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		AgeComparator a = new AgeComparator();
		RollNoComparator b = new RollNoComparator();
		//Collections.sort(al); 
		Collections.sort(al,a);
		for(Student s:al) {
			System.out.println(s.rollno + " "+ s.age+ " "+ s.name);
		}
		
		System.out.println("Age comparision done ");
		
		Collections.sort(al,b);
		for(Student s:al) {
			System.out.println(s.rollno + " "+ s.age+ " "+ s.name);
		}
		
		System.out.println("RollNo comparision done ");
	}

}
