package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSaftey();
		
		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();
		//c.theftSaftey -- only available in BMW reference variable object

	}

}
