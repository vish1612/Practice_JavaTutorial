package OOPsConcepts;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arl = new ArrayList();
		arl.add(100);
		arl.add(200);
		arl.add(600);
		arl.add("Testing");
		arl.add("Object");
		arl.add("Red");
		
		System.out.println(arl);
		
		System.out.println(arl.size());
		
		for(int i=0;i<arl.size();i++)
		{
			System.out.println(arl.get(i));
		}
		
		
				
	}

	
}
