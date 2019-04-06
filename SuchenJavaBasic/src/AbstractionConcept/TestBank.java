package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb  = new HDFCBank();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		//b.funds(); only available in HDFCBank class
		
		//Bank b = new Bank(); can not create object of abstract class
	

	}

}
