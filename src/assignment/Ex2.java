package assignment;

public class Ex2 {
	public static void main(String[] args) {
		Child_2 c = new Child_2();
		System.out.println("x=" + c.getX());
	}

}
class Parent_2 {
	int x = 100;
	Parent_2() {
		this(200);
	}
	Parent_2(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}
class Child_2 extends Parent_2 {
	int x = 3000;
	Child_2() {
		this(1000);
	}
	Child_2(int x) {
		this.x = x;
	}
}
