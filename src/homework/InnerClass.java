package homework;

public class InnerClass {
	public static void main(String[] args) {//for inner classes calling we required static met
InnerClass i = new InnerClass();
//i.m1(); by creating obj we can't call inner class
Praju.m1();
Pooja.m2();
	}

	 class Praju {
		static void m1() {
			System.out.println("hi");
		}
	}

	class Pooja {
		static void m2() {
			System.out.println("hello");
		}
	}
}
