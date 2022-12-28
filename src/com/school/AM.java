package com.school;

public class AM {int RollNO;
int rollNo;
String name;
char division;
double percentage;
private boolean adharcard;

	public static void main(String[] args) {
		AM a = new AM();
		System.out.println(a);
		a.rollNo =10;
		a.name = "prajakta";
		a.division = 'b';
		a.adharcard = true;
		a.percentage = 72.1;
		 System.out.println(a);
		 System.out.println(a.hashCode());
		
	}

	@Override
	public String toString() {
		return "AM [RollNO=" + RollNO + ", rollNo=" + rollNo + ", name=" + name + ", division=" + division
				+ ", percentage=" + percentage + ", adharcard=" + adharcard + "]";
	}
}
