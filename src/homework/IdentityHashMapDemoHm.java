package homework;

import java.util.IdentityHashMap;

public class IdentityHashMapDemoHm {
	public static void main(String[] args) {
		String s1 = new String("praju");
		String s2 = new String("praju");
		IdentityHashMap ihm = new IdentityHashMap ();
		ihm.put(s1,"one");
		ihm.put(s2,"one");
	}

}
