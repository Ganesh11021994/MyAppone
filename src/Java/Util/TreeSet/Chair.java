package Java.Util.TreeSet;

import java.util.Objects;

public class Chair implements Comparable<Chair> {
	int rollNo;
	private String colour;
	

	@Override
	public String toString() {
		return "Chair [rollNo=" + getRollNo() + ", colour=" + colour + "]";
	}


	public Chair(int rollNo, String colour) {
		super();
		this.setRollNo(rollNo);
		this.colour = colour;
	}





	@Override
	public int hashCode() {
		return Objects.hash(colour, rollNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chair other = (Chair) obj;
		return Objects.equals(colour, other.colour) && rollNo == other.rollNo;
	}


	public Chair() {
		// TODO Auto-generated constructor stub
	}


	@Override
public int compareTo(Chair o) {
		if (this.getRollNo()==o.getRollNo())
		return 0;
		else if(this.getRollNo()<o.getRollNo())
			return 1;
		else return -1;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
