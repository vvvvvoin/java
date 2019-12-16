package school;

public class Teacher extends Person {
	private String subject;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("담당과목 : %s%n", subject);
	}
	
}
