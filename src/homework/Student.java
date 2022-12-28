package homework;

public class Student {
	private int rollNo;
	String Name;
	static String guruji = "igr";

	public Student() {
		System.out.println("i am default constrctor");
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name) {
		System.out.println(" i am parameterize constructor");
		this.rollNo = rollNo;
		Name = name;
	}

	public String toString() {
		return "Student [rollNo=" + getRollNo() + ", Name=" + Name + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	{// instance block
		System.out.println("i am instance block");
	}
	static {
		System.out.println("i am the boss");
	}
};
