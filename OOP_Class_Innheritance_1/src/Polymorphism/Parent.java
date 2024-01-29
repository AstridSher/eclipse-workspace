package Polymorphism;

public class Parent {
	void print() {
		System.out.println("parent class");
		
	}
}

class child1 extends Parent{
	void print() {
		System.out.println("childclass1");
	}
}

class child2 extends Parent{
	void print() {
		System.out.println("childclass2");
	}
}