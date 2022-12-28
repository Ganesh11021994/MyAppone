package basicFlowControl;

public class Switch1 {
public static void main(String[] args) {
	byte a = 20; // in case it is possible to allowed expressions like + *
	switch (a) {
	case 10+ 10: System.out.println("ratan");
	break;
	case 20*4:
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
