package collections;
import java.util.ArrayList;

public class Demo_1 {
//----------------------ArrayList Example-------------------------- //
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);
		System.out.println(al.contains(200));
		
		ArrayList al2 =new ArrayList();
		al2.add("aaa");
		al2.add("bbb");
		al2.add("ccc");
		System.out.println(al2);
		System.out.println(al2.isEmpty());
		
		al.addAll(al2);
		System.out.println(al);
	}

}
