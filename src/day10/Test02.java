package day10;

public class Test02 {

	public static void main(String[] args) {
//		Employee2<String, String> emp1 =
//				new Employee2<String, String>("홍길동", "12345");
//		System.out.println(emp1);
		
		Employee2<String, Integer> emp2 =
				new Employee2<String, Integer>("홍길동", 12345);
		System.out.println(emp2.number/1000);

		Employee2<String, Double> emp3 =
				new Employee2<String, Double>("홍길동", 12345.0);
		System.out.println(emp3);
		
		Employee2 emp4 = new Employee2("고길동", 201701);
		System.out.println(emp4);
		System.out.println(emp4.number.getClass());		
	}

}

class Employee2<T, P extends Number> {
	T name;
	P number;	//산술연산이 가능한 타입만 가능함 Number를 받을 수 있는 것만 가능

	public Employee2(T name, P number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", number=" + number + "]";
	}

}