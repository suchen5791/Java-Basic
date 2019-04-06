package OOPConceptPart1;

public class CallByValAndCalByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCalByRef obj = new CallByValAndCalByRef();
		
		int x = 10;
		int y = 20;
		obj.testSum(x,y); //call by value OR pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	
		}

	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValAndCalByRef t) {
		int temp;
		temp = t.p;//temp = 50
		t.p = t.q;//t.p = 60
		t.q = temp; //t.q =50
	}
}
