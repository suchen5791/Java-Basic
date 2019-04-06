package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add:
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		//print:
		System.out.println("conrent of linkedlist:"+ ll);
		
		//addfirst:
		ll.addFirst("Suchen");
		//addlast:
		ll.addLast("Automation");
		System.out.println("content of linkedlist:"+ ll);
		
		//get:
		System.out.println(ll.get(0));
		//set:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		System.out.println("content of linkedlist:"+ ll);
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist:"+ll);
		
		ll.remove(2);
		System.out.println("content of linkedlist:"+ll);
		
		System.out.println("********");
		//how to print all the values of LinkedList:
		//1.for  loop
		for(int i =0; i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		//2.advance for loop:
		System.out.println("********");
		for(String str: ll) {
			System.out.println(str);
		}
		//3.iterator:
		System.out.println("********");
		Iterator<String> it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//4.while loop:
		System.out.println("********");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
