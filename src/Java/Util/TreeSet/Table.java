package Java.Util.TreeSet;

import java.util.Comparator;

public class Table implements Comparator<Chair> {

	@Override
	public int compare(Chair o1, Chair o2) {
		if(o1.rollNo==o2.rollNo)
			return 0 ;
		else if (o1.rollNo<o2.rollNo)
			return -1;
		else 
			return 1;}

}
