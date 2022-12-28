package basicFlowControl;

public class Switch4MultiVarible {
	public static void main(String[] args) {
		 final byte a = 10 // final Variables are allowed in case levels
				 // Variables are not allowed in case levels
		, b = 20,
		c = 30;
		switch (a) {
		case a:
			System.out.println("ratan");
			break;
		case b:
			System.out.println("aun");
			break;

		case c:
			System.out.println("durga");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
