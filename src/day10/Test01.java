package day10;

public class Test01 {

	public static void main(String[] args) {
		Employee<String> emp1 = new Employee("홍길동", "20190001");
		System.out.println(emp1);
		System.out.println(emp1.number.charAt(3));
		
		Employee<Integer> emp2 = new Employee("고길동", 20190002);
		System.out.println(emp2);
		System.out.println(emp2.number.getClass());
		
		Employee emp3 = new Employee("김길동", 20190003);
		System.out.println(emp3);
		System.out.println(emp3.number.getClass());
		
		
		
	}

}

class Employee<T>{
	String name;
	T number;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}
	
	
}