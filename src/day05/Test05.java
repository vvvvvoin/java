package day05;

public class Test05 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "kim sung je";
		emp1.dept = "기술부";
		emp1.age = 30;
		Employee emp2 = new Employee();
		emp2.name = "최길동";
		emp2.dept = "인사부";
		emp2.age = 32;

		Employee emp3 = emp1;
		
		emp1.print();
		emp2.print();
		emp3.print();

		Employee[] employees = new Employee[5];

	}		
}

class Employee {
	String name;
	String dept;
	int age;

	public void print() {
		System.out.printf("[%s, %s, %d] %n", this.name, this.dept, this.age);
		return;
	}
}