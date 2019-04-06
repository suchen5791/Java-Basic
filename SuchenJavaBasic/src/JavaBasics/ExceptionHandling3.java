package JavaBasics;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		System.out.println("ABC");
		try {
			throw new Exception("SUCHEN EXCEPTION");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("PQR");
		
		String Exec_Flag = "N";
		if(Exec_Flag.equals("")) {
			try {
				throw new Exception("Exec flag is Blank Exception");
			} catch (Exception e) {
				
			}
		}

	}

}
