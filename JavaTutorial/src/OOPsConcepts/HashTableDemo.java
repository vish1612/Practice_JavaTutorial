package OOPsConcepts;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		
		ht.put("1", "Object");
		ht.put("2", "Hello");
		ht.put("3", "World");
		
		System.out.println(ht);
		System.out.println(ht.size());
		System.out.println(ht.get("2"));
		
		System.out.println("Traverse in HashTable");
		Enumeration e = ht.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		Hashtable ht2 = new Hashtable();
		ht2= (Hashtable) ht.clone();
		
		System.out.println("Cloing Hashtable"+ht2);
	}

}
