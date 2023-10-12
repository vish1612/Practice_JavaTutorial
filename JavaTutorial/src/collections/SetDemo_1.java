package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s = new HashSet();
		s.add(10);
		s.add(null);
		s.add(null);
		s.add("Deepak");
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
	}

}
