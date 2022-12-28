package homework;

public class StaIns {
	//int a= 2;
	//static int b= 4;
	{
		System.out.println("i am instance bloack");
	}
	static {
		System.out.println("i am static block");
	}
	public static void main(String[] args) {
		StaIns n = new StaIns();
	}
}
