package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new ArrayList();
		
		l.add(0, 10);
		l.add(20);
		l.add(1,30);
		l.add(20);
		l.add(1,70);
		//System.out.println(l);		
	
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
