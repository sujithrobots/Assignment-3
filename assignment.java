package asssignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class assignment {

	public static void main(String[] args) {

		assignment mobile = new assignment();
		mobile.method1();
		mobile.method2();
		mobile.method3();
		mobile.method4();
		mobile.method5();
		mobile.method6();

	}

	public void method1() {
//using for loop
		List<Integer> al1 = new ArrayList<Integer>();

		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(45);
		al1.add(82);

		for (int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));
		}
		System.out.println("=======================================================================================================");
	}

	public void method2() {
		//using for each loop
		List<Integer> al1 = new ArrayList<Integer>();

		al1.add(12);
		al1.add(23);
		al1.add(35);
		al1.add(48);
		al1.add(82);

		for (Integer name : al1) {
			System.out.println(name);

		}
		System.out.println("=======================================================================================================");

	}
	public void method3() {
		//using for iterator
		List<Integer> al1 = new ArrayList<Integer>();

		al1.add(35);
		al1.add(89);
		al1.add(44);
		al1.add(67);
		al1.add(54);
		
		Iterator i=al1.iterator();

		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("=======================================================================================================");

	}
	public void method4() {
		List<Integer> al1 = new ArrayList<>();

		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(20);
		int total1=0;
		for(int i=0;i<al1.size();i++) {
			total1=total1+al1.get(i);
			//total1+=al1.get(i);
			
		}
		System.out.println("Get size "+al1.size());
		System.out.println(total1);
		System.out.println("=======================================================================================================");
	}
	public void method5() {
		ArrayList<Object> al1 = new ArrayList<Object>();

		al1.add(33);
		al1.add(44);
		al1.add(55);
		al1.add(66);
		al1.add(77);
		al1.add(88);
		
		System.out.println(al1);
		System.out.println(al1.remove(1));
		System.out.println(al1);
		System.out.println(al1.remove(Integer.valueOf("55")));
		System.out.println(al1);
		al1.add(3,"90");
		System.out.println(al1);
		
		//int len=al1.size();
		Object[] myArray=new Object[al1.size()];
		al1.toArray(myArray);
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		
		System.out.println("=======================================================================================================");
	}
	public void method6(){
		ArrayList<Object> list = new ArrayList<Object>();

		list.add("Web Automation");
		list.add("API Automation");
		list.add("Mobile Automation");
		
		System.out.println(list);
		System.out.println(list.contains(String.valueOf("Mobile Automation")));
		
	}
	
}

