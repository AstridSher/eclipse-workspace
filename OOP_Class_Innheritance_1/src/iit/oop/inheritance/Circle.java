package iit.oop.inheritance;

public class Circle extends Shape{
	public int radius;
	
	public double area(int r) {
		return Math.PI*super.area(r) *super .area(r);
	}



}
