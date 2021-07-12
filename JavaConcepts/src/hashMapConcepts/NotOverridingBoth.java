package hashMapConcepts;

import java.util.HashMap;

//If we dont override both of method equals() and hashCode(), these are called from object class
//hashCode() implementation of Object class is independent of object state change. If a class has not overridden hashCode() and equals() method 
//then hashCode() method of object class will be called and it will return same hashCode even after change in object state.

public class NotOverridingBoth {

	public static void main(String[] args) {
		
		HashMap<Employee2, Integer> emap = new HashMap<Employee2, Integer>();  
        Employee2 emp = new Employee2(101, "vikas", "Dev");
        emap.put(emp, 2015);
        
        System.out.println(" hascode of Employee object = "+emp.hashCode());   //2018699554
		emp.setDepartment("QA");
		System.out.println(" hashcode of Employee object after changing state = "+emp.hashCode()); //2018699554 same 
		
		
		System.out.println("  emp id =="+ emap.get(emp));      //Able to retrieve object,  printing - > object
		

	}

}

class Employee2{
	
	int id;
	String name;
	String department;
	
	public Employee2() {
		super();
	}

	public Employee2(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/
	
	/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
*/   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}	
