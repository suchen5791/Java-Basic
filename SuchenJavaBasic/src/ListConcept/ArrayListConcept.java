package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept {

	public static <E> void main(String[] args) {
	
		int a[] = new int[3]; // static array -- size is fixed
		
		//dynamic array -- ArrayList
		//1.can contain duplicate values
		//2.maintains insertion order
		//3.Not Synchronized
		//4.allows random access to fetch the element because it stores values on basis of indexes
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		ar.add(12.33);
		ar.add("Test");
		ar.add(true);
		System.out.println(ar.size());// size of arraylist
		
		System.out.println(ar.get(4));//to get the value from an index
		
		//to print all the values from  arraylist: for loop
		//1.for loop
		//2.using iterator
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic:
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Selenium");
        
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		//ar2.add(100);
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//Employee class objects:
		Employee e1 = new Employee("Suchen",45,"QA");
		Employee e2 = new Employee("Tom", 30,"Dev");
		Employee e3 = new Employee("Peter", 40, "Admin");
		
		//create arraylist:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values:
		Iterator<Employee> it  = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("*************");
		
		//***********
		//addAll()
		  
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("Java script");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*************");
		
		//removeaLL:
		ar5.removeAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*************");
		
		//retainAll:
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("java");
		
		ar7.retainAll(ar8);
		
		for(int i=0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
		
		
		
		
		
		
	}

}
