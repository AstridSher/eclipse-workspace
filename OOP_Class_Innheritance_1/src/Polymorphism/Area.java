package Polymorphism;

public class Area {
	static int area(int a, int b) {
		return a*b;
	}
	
	static double area(double a) {
		return 3.14*a*a;
	}
	static double area(double a, double b) {
		return 0.5*a*b;
	}
//	static String area(String a) {
//		return a;
//		
//	}
	String area(String a) {
		return a;
	}
}
