package AbstractionConcept;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 10;
	static int loanrate = 5;
	
	//partial abstraction
	//hiding the implementation logic -- is called Abstraction
	//abstract class can have abstract methods and as well as non abstract methods
	
	public abstract void loan();// abstract method -- no method body
	
	//non abstract methods
	public void credit() {
		System.out.println("Bank -- Credit");
	}
	
	public void debit() {
		System.out.println("Bank -- Debit");
	}


}
