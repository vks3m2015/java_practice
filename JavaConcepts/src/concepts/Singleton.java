package concepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;

/*
 * 
 * 
 * //https://www.youtube.com/watch?v=GH5_lhFShfU
 */


public class Singleton implements Serializable, Cloneable{
    
	private static Singleton singletonInstance = null;
	private Singleton()
	{
		if(singletonInstance != null )
			throw new RuntimeException("cann't create. Use getInstance() to create .. ");
		
		System.out.println(" Creating Singleton class object....");
	}
	
	public static Singleton getInstance()
	{
		if(singletonInstance == null)
			singletonInstance = new Singleton();
		
		return singletonInstance;
	}
	
	private Object readResolve() throws ObjectStreamException
	{
		System.out.println(".. readResolve ...");
		return singletonInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		//return super.clone();
	}
	
	public static void main(String[] args) throws Exception
	{
		
		Singleton singletonObj1  = Singleton.getInstance();
		Singleton singletonObj2  = Singleton.getInstance();
		
		print("singletonObj1", singletonObj1);
		print("singletonObj2", singletonObj2);
		
		//Reflection
		//Class singletonClass = Class.forName("javaConcepts.Singleton");
		Constructor cons = Singleton.class.getDeclaredConstructor();
		cons.setAccessible(true);
		Singleton singletonObj3 = (Singleton)cons.newInstance();
		
		print("singletonObj3", singletonObj3);
		
		
		//Serialization and DeSerialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\vik\\Gyan\\serializationPurpose.txt"));
		oos.writeObject(singletonObj1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\vik\\Gyan\\serializationPurpose.txt"));
		Singleton singletonObj4 = (Singleton)ois.readObject();
		
		print("singletonObj4",singletonObj4);
		
		//Cloning
		Singleton singletonObj5 = (Singleton)singletonObj1.clone();
		print("singletonObj5", singletonObj5);

	}
	
	public static void print(String name, Singleton singletonObj)
	{
		System.out.println(" HashCode of "+name +" = "+ singletonObj.hashCode());
	}

}
