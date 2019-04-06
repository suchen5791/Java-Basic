package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal = 200; can not change value of Interface variable, its final/constant in nature
	
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		//dynamic polymorphism
		//child class object can be referred by parent Interface reference variable
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		

	}

}
