package basicAbstractClass;

public class AbstractDemo2 extends AbstractDemo {

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("b");
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("c");
	}
public static void main(String[] args) {
// AbstractDemo a = new AbstractDemo();error AbstractDemo is abstract;cannot be instantiated
	AbstractDemo2 a = new AbstractDemo2();
	a.m1();a.m2();a.m3();a.m4();
	// parent p = new child();
	AbstractDemo am = new AbstractDemo2();
	a.m1();a.m2();a.m3();a.m4();
	
}
}
