package homework;

import java.util.Comparator;

public class Table2 implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		if(o1.rollNo==o2.rollNo)
		return 0;
		else if (o1.rollNo<o2.rollNo)
			return -1;
		else return 1;
	}

}
