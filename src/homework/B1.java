package homework;

public class B1 {



	static {
		System.out.println("I am static block");
	}
	{
		System.out.println("I am instance block");
	}
}

class Praj{
	public static void main(String[] args) {
		B1 b = new B1();

	}
}