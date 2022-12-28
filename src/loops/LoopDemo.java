package loops;

import java.util.HashSet;
import java.util.Set;

public class LoopDemo {
	public static void main(String[] args) {

		int[] p = { 4, 6, 7, 8 ,6 };
		int[] r = { 5, 6, 8, 1 };
		Set<Integer> s = new HashSet<>();
		
	
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < r.length; j++) {
				if (p[i] == r[j]) {
				s.add(p[i]);
					
			}
			}
		}System.out.println(s);
	}
}
