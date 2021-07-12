package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {
	
	
	public static void main(String[] arg)
	{
		List<Student> al = new ArrayList<Student>();	
	    al.add(new Student("vikas", 102));
	    al.add(new Student("ut", 101));
	    
	    
	    Comparator<Student> cmp = new Comparator<Student>() {
	    	
	    	public int compare(Student st1, Student st2)
	    	{
	    		return st1.roll_num - st2.roll_num;
	    	}
	    	
	    };
	    
	    System.out.println(" before sort al == "+al);
	    Collections.sort(al, cmp);
	    
	    System.out.println(" after sort al == "+al);
	}

}




class Student{
	
	String name;
	int roll_num;
	
	Student(String name, int roll_num)
	{
		this.name = name;
		this.roll_num = roll_num;
	}
	
	public String toString()
	{
		return "Student { name = "+name+ ", roll_num =  "+roll_num +" }";
	}
	
}
