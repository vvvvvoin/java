package day08;

public class Test07 {

	public static void main(String[] args) {
		Circle1 a = new Circle1();
		System.out.println(a.cArea(5));
		a.print();
		a.color = "blue";
		System.out.println(a.color);
		
		Circle_i i = new Circle_i();
		System.out.println(i.cArea(5));
		//i.color = "blue";
		System.out.println(i.color);
	}

}

class Circle1 extends Shape_a{

	@Override
	public double cArea(double r) {
		return (Math.PI) * Math.pow(r, 2);
	}

}

abstract class Shape_a{
	String color;
	public abstract double cArea(double r);
	public void print() {
	}
}

interface Shape_i{
	final static String color = "red";
	double cArea(double r);
}

class Circle_i extends Object implements Shape_i{
	@Override
	public double cArea(double r) {
		return (Math.PI) * Math.pow(r, 2);
	}
	
}









