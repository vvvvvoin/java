package prob6_shape;

public class Rectangle extends Shape {
	double width, hight;
	
	public Rectangle() {
		super();
	}

	public Rectangle(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}

	@Override
	void calculationArea() {
		super.setArea(width * hight);

	
	}

}
