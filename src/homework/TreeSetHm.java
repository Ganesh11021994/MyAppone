package homework;

import java.util.TreeSet;

public class TreeSetHm {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(11);
		t.add(1);
		t.add(50);
		//t.add("praju");
		System.out.println(t);
		
		TreeSet t1= new TreeSet();
		t1.add("sourabh");
		t1.add("teju");
		t1.add("rutujaaa");
		
		System.out.println(t1);
		TreeSet t2= new TreeSet();
		t2.add(new Board (5,"sourabh") );
		t2.add(new Board (89,"teju") );
		t2.add(new Board (60,"mon") );
	}

}
