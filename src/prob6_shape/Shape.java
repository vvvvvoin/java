package prob6_shape;

public abstract class Shape {
	private double area;
	private String name;

	public Shape() {
		super();
	}

	public Shape(String name) {
		super();
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void calculationArea();

	public void print() {
		if (getName().equals("원")) {
			System.out.print("원의 면적은 ");
			System.out.println(getArea());
		}
		if (getName().equals("직사각형")) {
			System.out.print("직사각형이 면적은 ");
			System.out.println(getArea());
		}

	}

}
