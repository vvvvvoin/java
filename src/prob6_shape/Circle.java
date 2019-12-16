package prob6_shape;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		super();
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	void calculationArea() {
		super.setArea(Math.PI * Math.pow(radius, 2));
	}



}
