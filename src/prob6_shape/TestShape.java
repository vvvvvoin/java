package prob6_shape;

public class TestShape {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2];

		shape[0] = new Circle("원", 10);
		shape[1] = new Rectangle("직사각형", 10, 20);

		for (int i = 0; i < shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
			
		}
		System.out.println(shape[0]);
		System.out.println(shape[1]);

	}

}
