package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
	
		//STATIC POLYMORPHISM -- compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refule();
		b.theftSaftey();
		b.engine();//inheriting from grandparent
		
		System.out.println("*******");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		//c.theftSaftey(); can not inherit methods from child class
		
		System.out.println("*******");
		
		//Top Casting
		Car c1 = new BMW();//child class object can be referred by parent class reference variable -- DYNAMIC POLYMORPHISM --run time polymorphism
		c1.start();
		c1.stop();
		c1.refule();
		//c1.theftSaftey(); can refer object but can not take its properties/methods
		
		//Down Casting
		BMW b1 = (BMW)new Car();//ClassCastException
		
		
		

	}

}
