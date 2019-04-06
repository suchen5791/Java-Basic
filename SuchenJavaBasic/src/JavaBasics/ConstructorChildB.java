package JavaBasics;

public class ConstructorChildB extends ConstructorParentA {

	public ConstructorChildB() {

		super(10, 20);

		System.out.println("child class constructor");
	}

	public static void main(String[] args) {

		ConstructorChildB obj = new ConstructorChildB();

	}

}
