package OOPsConcepts;

public class InheritanceDemo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheriatnceDemo_BMW bmw = new InheriatnceDemo_BMW(); //Static Polymorphism or Compile Time Polymorphism
		bmw.type();
		bmw.Color();
		bmw.BodyType();
		bmw.gearType();
		
		System.out.println("-------------------------------");
		InheritanceDemo_Car car_1 = new InheritanceDemo_Car();
		car_1.vehicalType();
		car_1.type();
		car_1.gearType();
		
		System.out.println("-------------------------------");
		InheritanceDemo_Car car = new InheriatnceDemo_BMW(); // Runtime Polymorphism or dynamic polymorphism or Top casting
		car.vehicalType();
		car.type();
		car.gearType();
		
		System.out.println("-------------------------------"); //Down Casting not allowed in this 
		InheriatnceDemo_BMW bmw1 = (InheriatnceDemo_BMW)new InheritanceDemo_Car();
		bmw1.BodyType();
		
	}

}
