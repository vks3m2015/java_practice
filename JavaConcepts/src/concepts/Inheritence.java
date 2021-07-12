package concepts;

class Inheritence {

}

class Parent{
	
	int a =10;
	
	public void method()
	{
		System.out.println(" Parent class  a ="+a);	
	}
	
	public void method2()
	{
		System.out.println("  Parent class method2  ....");
	}
	
	
}

class Child extends Parent{
	
	int a= 20;
	
	public void method()
	{
		System.out.println(" Child class  a ="+a);	
	}
	
	public void method3()
	{
		System.out.println(" Child class  method3 ....");
		 method2();
	}
	
	public static void main(String[] arg)
	{
		Parent obj1 = new Child();
		
		 obj1.method();                     //method overriding
		 System.out.println("  obj1 == "+ obj1.a);   // 		variable overriding is not supported in java. It will print parent class variable 
		 
		 
		 Child obj2 = new Child();
		 obj2.method2();
		 
		 Parent obj3 = new Child();
		 obj3.method2();
		 
		 obj2.method3();
		 
		 /* method3() is in child class but not in Parent class
		  * compiler will look method3() in Parent class while compilation and will be looked in Child class at runtime(if executed)
		  * this is what RunTime Polymorphism
		  */
		 Parent obj4 = new Child();
		// obj4.method3();          // will give error in compilation 
		 
		
		 
		
	}
}
