package progamiz;

public class Immutable {
	// first string remain unchanged
	//once we create string we can not change it
	public static void main(String[] args) {
  String first = "hellow!";
  System.out.println(first);
  String second = "World";
  System.out.println(second);
  String joinedString = first.concat(second);
  System.out.println(joinedString);
	}

}
