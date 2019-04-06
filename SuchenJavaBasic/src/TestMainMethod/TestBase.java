package TestMainMethod;

public class TestBase {

	//JVM -- main (String args[] args) -- public static void
	public static void main(String[] args) {
		System.out.println("main method-1");

		main("Testing");
		main(10);
		main(10, 20);
	}

	public static void main(String args) {
		System.out.println("main method-2");
	}

	public static void main(int a) {
		System.out.println("main method-3");
	}

	public static void main(int a, int b) {
		System.out.println("main method-4");
	}

}
