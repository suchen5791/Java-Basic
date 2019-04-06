package OOPConceptPart2;

public class BMW extends Car {//"has -a relationship"
	
	//when same method is present in parent class as well as child class with same number of arguments,
	//is called Method Overriding.
	
	public void start() {//overriden method
		System.out.println("BMW -- start");
	}
	
	public void theftSaftey() {
		System.out.println("bmw -- theft saftey");
	}
	

}
