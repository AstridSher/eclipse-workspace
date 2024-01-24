package iit.oop.inheritance;

public class Triangle extends Shape{
 private int base;
 private int height;
 
 public double area(int base, int height) {
	 return super.area(base)*super.area(height)*(0.5);
 }
}
