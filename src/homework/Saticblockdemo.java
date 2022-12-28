package homework;

//public class Saticblockdemo {
//	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException  {
//		Class.forName("B").newInstance();
//	}
//	
//}

class B {

	static {
		System.out.println("I am static block");
	}
	{
		System.out.println("I am instance block");
	}
}

class A {
	public static void main(String[] args) {
		B b = new B();

	}
}