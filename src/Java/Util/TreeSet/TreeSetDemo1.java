package Java.Util.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {

//		TreeSet t1 = new TreeSet();
//		t1.add(10);
//		t1.add(38);
//		t1.add(70);
//		t1.add(56);
//		// t1.add("praj");
//		System.out.println(t1);

		TreeSet t2 = new TreeSet(new Pen());
		t2.add("Prar");
		t2.add("Pra");
		t2.add("tejuuu");
		t2.add("mohan");
	System.out.println(t2);

//		TreeSet t3 = new TreeSet();
//		t3.add(new Chair(1, "pink"));
//		t3.add(new Chair(50, "black"));
//		t3.add(new Chair(37, "red"));
//		t3.add(new Chair(48, "red"));
//		System.out.println(t3);
	}
}


