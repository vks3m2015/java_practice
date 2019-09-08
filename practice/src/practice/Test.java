package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   String st1 = new String("vikas");
	   
	   String st2 =new String("vikas");
	   
	   String st3 ="vikas";
	   String st4 = "vikas";
	   
	  
	   System.out.println("--1--"+st1.equals(st2));
	   
	   
	   System.out.println(" ----3 ---   "+ (st1 == st2));
	  System.out.println("  -----4 ----  "+ (st3 == st4));
	   System.out.println(" Hashcode of string1 ="+st1.hashCode() +"  hashcode of string2 ="+st2.hashCode() + "   hashcode of string 3 ="+st3.hashCode());
	
	
	}

}
