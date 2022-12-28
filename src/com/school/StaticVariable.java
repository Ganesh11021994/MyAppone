package com.school;

public class StaticVariable {
	static int x;
	static int y;
	static int z;

	public static void main(String[] args) {
		StaticVariable.x = 10;// by using class name
		y=20; // direct call
		StaticVariable iv = new StaticVariable();
		iv.z = 30;// by creating object
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

	@Override
	public String toString() {
		return "InstanceVariable [x=" + x + ", y=" + y + "]";
	}

}
