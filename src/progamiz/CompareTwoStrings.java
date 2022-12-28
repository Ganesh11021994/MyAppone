package progamiz;

public class CompareTwoStrings {
	public static void main(String[] args) {
		//create 3 strings
		String first = "java programing";
		String second = "java programing";
		String trird = "python programing";
		
		// compare first and second strings
		boolean result1 = first.equals(second);
		System.out.println("string first + string second" + result1);
		// compare second and third 
		boolean result2 = second.equals(trird);
		System.out.println("string second + string third"+ result2);
	}

}
