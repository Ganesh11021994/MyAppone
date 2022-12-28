package homework;

//import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		String first =  new String("praju");
		String second = new String("bds");
		//HashMap hm = new HashMap();
		WeakHashMap whm = new WeakHashMap();
		whm.put(first, "one");
		whm.put(second, "two");
		System.out.println(whm);
		second= null;
		System.gc();
		Thread.sleep(300);
		System.out.println(whm);
	}

}
