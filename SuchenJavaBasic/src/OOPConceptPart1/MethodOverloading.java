package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		}
	
	//yes main method can be over loaded
	public static void main(int p) {
	}
	
	public static void main(int q, int h) {
	}
	
	//you can not create a method inside a method
	//duplicate methods --i.e same method name with same number of arguments are not allowed
	
	//method overloading --> when the method name is same with different arguments or input parameters with in same class.
		public void sum() {
		System.out.println("sum method - zero param");
	}
	
		public void sum(double d) {
		System.out.println("sum method - zero param");
	}
	
			
	    public void sum(int i) {
		System.out.println("sum method - 1 parameter");
		System.out.println(i);
	}
	
	   public void sum(int k, int l) {
		System.out.println("sum method - 2 parameter");
		System.out.println(k+l);
	}
	
	
	

}
