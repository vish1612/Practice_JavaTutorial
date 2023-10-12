package OOPsConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Virat");
		hm.put(2, "Ashok");
		hm.put(3, "Ram");
		hm.put(4, "Rohit");
		hm.put(1, "Anmol");
		hm.put(null,"Vishal");
		hm.put(5, "Ashok");
		hm.put(6, null);
		System.out.println("-----------------------------");
		System.out.println("The Values in Hashmap-: "+hm );
		
		System.out.println("-----------------------------");
		hm.remove(null);
		System.out.println("After Remove-:"+hm);
		
		System.out.println("------------To Iterate Value-----------------");
		for(Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() +" " +m.getValue());
		}
		
		System.out.println(hm.get(4));
		hm.replace(5, "Anil");
		System.out.println("After Replace "+hm);
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.putAll(hm);
		System.out.println("Copied Hashmap-:" +hm1);
		
	}

}
