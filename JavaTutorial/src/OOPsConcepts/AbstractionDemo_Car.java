package OOPsConcepts;

public class AbstractionDemo_Car extends AbstarctionDemo{

	public static void main(String[] args) {
		
		AbstractionDemo_Car ab = new AbstractionDemo_Car();
		ab.shape();
		ab.body();
		ab.fuelType();
		}

	@Override
	public void body() {
		// TODO Auto-generated method stub
		System.out.println("Abstarct Method Body");
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method Shape");
	}

}
