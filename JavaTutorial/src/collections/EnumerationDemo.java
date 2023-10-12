package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		v.add(10);
		v.add("Kamlesh");
		v.add("hitesh");
		
		//system.out.println(v);
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
