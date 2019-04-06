package JavaBasics;

public class ExceptionHandling2 {

	public static void main(String[] args) throws ArithmeticException{
		ExceptionHandling2 obj = new ExceptionHandling2();
		obj.sum();
		System.out.println("ABC");

	}
	
	public void sum()throws ArithmeticException {
		try{
			div();
		}catch(ArithmeticException e) {
			 
		}
	}
	
	public void div() throws ArithmeticException {
		int i = 9/0; //exception line
	}
	
	

}
