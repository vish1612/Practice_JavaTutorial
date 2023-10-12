package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new ArrayList();
		
		l.add(10);
		l.add("Deepak");
		l.add("Mayur");
		l.add(20);
		
		//System.out.println(l);		
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		itr.remove();
		System.out.println(l);
		
		l.remove(0);
		System.out.println(l);
	}

}
