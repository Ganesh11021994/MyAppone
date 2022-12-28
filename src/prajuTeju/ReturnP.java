package prajuTeju;

public class ReturnP {
	void m1() {
		m2();
		System.out.println("m1 method");
	}

	static void m2() {
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		ReturnP r = new ReturnP();
		r.m1();
		ReturnP.m2();
	}
}

