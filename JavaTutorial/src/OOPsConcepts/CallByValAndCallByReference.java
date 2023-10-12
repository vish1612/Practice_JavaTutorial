package OOPsConcepts;

public class CallByValAndCallByReference {
	
	int c,d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValAndCallByReference obj = new CallByValAndCallByReference();
		System.out.println(obj.sum(20, 30)); //This is the way we pass value and call means call by value of particular method
		int m=40, n=20;
		System.out.println(obj.sum(m, n)); //Call By Value 
		
		obj.c = 100;
		obj.d = 200;
		obj.swap(obj); // Call by Reference, Here we pass the reference of our object
		System.out.println("After Swap");
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		
	}
	public int sum(int a, int b) // Call by Value
	{
		int x = a + b;
		return x;
	}
	
	public void swap(CallByValAndCallByReference t) //Call by Reference 
	{
		int temp;
		temp = t.c;
		t.c = t.d;
		t.d = temp;
	}

}
