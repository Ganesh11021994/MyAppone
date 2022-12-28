package progamiz;

public class StringIsNumaric {
	public static void main(String[] args) {
		String str = "128.6";
		boolean numeric = true;
		try {
			Double num = Double.parseDouble(str);
		} catch (NumberFormatException e) {
			numeric = false;
		}
		if (numeric) {
			System.out.println(str + "is a Numeric");
		}
		else System.out.println(str + "is a not Numeric");
	}

}
