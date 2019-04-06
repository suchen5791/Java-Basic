package AbstractionConcept;

public interface Car {
	//only final and static variables can be defined ( consider as default)
	int wheels = 4;
	
	//all ways define only abstract methods
	//no method body
	//only method declaration
	//no need to write abstract keyword
	//we achieve 100% abstraction
	//can not create the object of interface
	
	public void start();
	public void stop();
	public void refuel();

}
