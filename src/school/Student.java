package school;

public class Student extends Person{
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student() {
		super();
	}
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("학     번 : %s%n", id);
	}

	
	
}
