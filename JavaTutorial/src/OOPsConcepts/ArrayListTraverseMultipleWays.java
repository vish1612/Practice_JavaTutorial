package OOPsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraverseMultipleWays {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Mrunal");
		ar.add("Vishal");
		ar.add("Arun");
		ar.add("Yamika");
		
		System.out.println("1. =====Using Lambda expression & for Each Loop========");
		ar.forEach(value->{
			System.out.println(value);
		});
		
		System.out.println("2. =====Using  Iterator========");
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("3. =====Using For Each Iterator and Lambda expression========");
		it = ar.iterator();
		it.forEachRemaining(value-> {
			System.out.println(value);
		});
		
		System.out.println("4. =====Using For Each loop========");
		for(String value : ar)
		{
			System.out.println(value);
		}
		
		System.out.println("5.=====Using For Each loop========");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		/*System.out.println("6.=====Using For Each loop========");
		Iterator<String> list = ar.listIterator(ar.size());
		while(list.hasPrevious())
		{
			
		}*/
 	}

}
