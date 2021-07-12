package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import beans.Employee;

public class Streams2 {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
					new Employee(222, "vks2", "Alt"),
					new Employee(111, "vks", "Cav"), 
					new Employee(333, "vks3", "Accen") );
		
		//empList.sort((e1, e2)-> e1.getId() - e2.getId() );
		
		//empList.forEach(System.out::println);
		
		//Print the name of first two Employees having minimum empId
		empList.stream()
		       .sorted((e1, e2)-> e1.getId() - e2.getId())
               .limit(2)
               .map(Employee :: getName)
               .forEach(System.out::println);
		
		//Comparator<T>
		
		//sCollections.sort(list);
	}

}
