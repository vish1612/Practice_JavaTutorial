package OOPsConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("Selenium");
		li.add("Java");
		li.add("Python");
		li.add("QTP");
		li.add("UFT");
		
		System.out.println("The Linked List is-: "+li);
		
		li.addFirst("Automation");
		li.addLast("Testing");
		System.out.println("---------------------------------------");
		System.out.println("The Linked List is-: "+li);
		
		li.set(2, ".net");
		System.out.println("---------------------------------------");
		System.out.println(li.get(3));
		System.out.println("The Linked List is-: "+li);
		
		System.out.println("----------Normal For Loop-------------------");
		for(int i=0; i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println("-----------Advance For Loop----------------");
		for(String str : li)
		{
			System.out.println(str);
	
		}
		
		System.out.println("-----------Through Iterator----------------");
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----------While Loop----------------");
		int num=0;
		while(li.size()>num)
		{
			System.out.println(li.get(num));
			num++;
		}
		}
}

