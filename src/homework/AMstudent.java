package homework;

public class AMstudent {
	public static void main(String[] args) {
		Student std = new Student();
		std.setRollNo(1);
		std.Name = "prajakta";
		System.out.println(std);
		System.out.println(std.toString());
		System.out.println(std.hashCode());
		Student s2 = new Student(1, "didi");
		System.out.println(std.guruji);
		s2.guruji= "icchh";
		System.out.println(std.guruji);
		System.out.println(s2.guruji);
	}

}
