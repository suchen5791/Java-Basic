package OOPConceptPart2;

public class HSBCBank implements USBank ,BrazilBank {//we are achieving multiple inheritance
	//IS-a relationship
	
	//If a class is implementing any Interface, then it is  mandatory to define/override all the methods of Interface.
	
	//overriding from USBank
	public void credit() {
		System.out.println("hsbc -- Credit");
	}
	
	public void debit() {
		System.out.println("hsbc -- Debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc --Transfer Money");
	}
	
	//seperate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc -- edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc -- Car Loan");
	}
	
	//brazil bank method: overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc -- mutual  fund");
	}

}
