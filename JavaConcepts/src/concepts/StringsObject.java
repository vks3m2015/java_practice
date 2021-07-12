package concepts;

public class StringsObject {

	public static void main(String[] args) {
		
		String s = "Vikas";
		String s1 = new String("Vikas");
		
		String s2 = s1.intern();
		
		System.out.println(" s == s1 "+ ( s == s1));   //FALSE
		System.out.println(" s == s2 "+ ( s == s2));    //TRUE
	}

}
