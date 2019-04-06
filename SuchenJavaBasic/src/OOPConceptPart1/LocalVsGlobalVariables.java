package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global Variables or class variables
	String name = "Tom";
	int age = 30;

	public static void main(String[] args) {
	
		int i = 10;//local variable for main method()
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.age);
		System.out.println(obj.name);
			
	}
        
	
	public void sum() {
		int i = 15;//local variable for sum()
		int j = 20;//local variable
		int age = 25;//local variable
				
		
	}
}
