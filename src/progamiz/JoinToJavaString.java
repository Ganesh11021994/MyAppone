package progamiz;

public class JoinToJavaString {
	public static void main(String[] args) {
		//create first string
		String first = "java";
		System.out.println("First String:" + first);
		//create second string
		String second = "Programing";
		System.out.println("second string:" + second);
		//join two string
		String joinedString = first.concat(second);
		System.out.println( "joind string" +joinedString);
	}

}
