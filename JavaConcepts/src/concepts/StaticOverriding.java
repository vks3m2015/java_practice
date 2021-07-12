package concepts;

public class StaticOverriding {

	public static void main(String[] args) {
		Mobile mob = new Lava();
		mob.m();
		
		Lava.m();

	}

}

class Mobile{
	
	public static void m() {
		System.out.println("static method of Mobile class...");
	}
	
	public static void m2() {
		System.out.println("static method of Mobile class...");
	}
	
}

class Lava extends Mobile{
    
	public static void m() {
		System.out.println("static method of LAVA class...");
		
		m2();
	}
	
	public static void m2() {
		System.out.println("static method m2() of LAVA class...");
	}
}
