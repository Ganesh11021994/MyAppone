package basicFlowControl;

public class Switch {
	public static void main(String[] args) {
		int a = 10; // ratan
		    // a = 20 anu
		   // a = 200 default
		switch (a) {
		case 10:
			System.out.println("ratan");
			break;
		case 20:
			System.out.println("aun");
			break;

		case 30:
			System.out.println("durga");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
