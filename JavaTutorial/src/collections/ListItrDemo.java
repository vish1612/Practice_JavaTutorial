package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new ArrayList();
		
		l.add(10);
		l.add("Deepak");
		l.add("Mayur");
		l.add(20);
		
		//System.out.println(l);		
		
		ListIterator litr = l.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("----------------------------");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	
		litr.set(100);
		System.out.println(l);
		
		litr.remove();
		System.out.println(l);
	}

}
