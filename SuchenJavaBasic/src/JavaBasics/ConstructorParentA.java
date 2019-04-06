package JavaBasics;

public class ConstructorParentA {
	
	public ConstructorParentA() {
		System.out.println("parent class constructor");
	}

	public ConstructorParentA(int i) {
		System.out.println("parent class constructor with value of i"+i);
	}
	
	public ConstructorParentA(int i , int j) {
		System.out.println("parent class constructor with value of i " + i);
		System.out.println("parent class constructor with value of j " + j);
	}
	
}
