package school;

public class SchoolApp {

	public static void main(String[] args) {
		/*
		 * Student[] s = new Student("홍길동", 20, 200201);
		 * Teacher[] t = new Teacher("이순신", 30, "JAVA");
		 * Employee[] e = new Employee("유관순", 40, "교무과");
		 * 
		 * student.print();
		 * teacher.print();
		 * employee.print();
		 */
		/*
		Person[] person = { new Student("홍길동", 20, 200201), new Teacher("이순신", 30, "JAVA"),
				new Employee("유관순", 40, "교무과") };
		
		for (Person data : person) {

			if (data instanceof Student) {
				((Student) data).print();

			}
			if (data instanceof Teacher) {
				((Teacher) data).print();

			}
			if (data instanceof Employee) {
				((Employee) data).print();

			}

		}
		*/
		
		Student[] s;
		Teacher[] t;
		Employee[] e;
		
		Person[] persons = {new Teacher("김선생", 30, "java"),
				new Teacher("최선생", 32, "sql"),
				new Teacher("박선생", 34, "db"),
				new Student("홍길동", 19, 555555),
				new Employee("박사원", 54, "교학부")};
		
		for (Person data : persons) {
			data.print();	//메소드는 하나인데 오버라이딩 때문에 각기 다른 기능으로 다형성이 발생함
		}
		
		/*
		for (Person data : persons) {
			if(data instanceof Employee) ((Employee)data).print();
			if(data instanceof Student) ((Student)data).print();
			if(data instanceof Teacher) ((Teacher)data).print();

			}
		*/

		

	}

}
