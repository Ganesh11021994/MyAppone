package callmeth;

import callmeth2.Parent;


public class Child extends Parent {
	int a = 4;
	void m1(){}
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m2();
		
		Child c = new Child();
		c.m2();
		c.m1();
		
		Parent pp = new Child();
		pp.m2();
		
	}

}
