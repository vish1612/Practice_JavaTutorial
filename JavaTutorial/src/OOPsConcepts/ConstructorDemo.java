package OOPsConcepts;

public class ConstructorDemo {
	
	String name;
	int age;
	
	public ConstructorDemo()
	{
		System.out.println("Default Constructor");
	}
	public ConstructorDemo(int i)
	{
		System.out.println("Single parameter Constructor"+i);
	}
	public ConstructorDemo(int j, float m)
	{
		System.out.println("Double Parameter Constructor"+j+" "+m);
	}
	public ConstructorDemo(String name,int age)
	{
		this.name=name; //this.class_var = loc_var
		this.age=age;	//this.calss_var = loc_var
		System.out.println("Class variable Constructor");
	}
	public static void main(String[] args) {
		
		ConstructorDemo c = new ConstructorDemo();
		ConstructorDemo c1 = new ConstructorDemo(20);
		ConstructorDemo c2 = new ConstructorDemo(10,40);
		ConstructorDemo c3 = new ConstructorDemo("Ajay",24);
		System.out.println(c3.name+" "+c3.age);
		
		
		
	}

}
