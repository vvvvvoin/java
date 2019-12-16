package day07;

public class Test02 {

	public static void main(String[] args) {

		Object a = new Animal(); // 좌변이 현재범위 우변이 최대범위
		((Animal) a).breath();

		Animal a2 = new Animal(); // 좌변이 현재범위 우변이 최대 접근 범위
		a2.breath();
		Object obj = a2; // 좌측이 부모 우측이 자식

		// Animal temp = obj; //좌측이 자식 우측이 부모이므로 오류발생
		Animal temp = (Animal) obj;// 하지만 다운캐스팅으로 형변환을 통해 접근가능하다
		temp.breath();

		Dog d = new Dog();
		System.out.println((d).kind);
		Object obj2 = d;
		Animal a3 = (Animal) obj2;
		Dog d3 = (Dog) obj2;
		System.out.println(a3.kind);
		System.out.println(d3.kind);

		String msg = "hello java";
		
		System.out.println("======================================");
		Object obj7 = a; // object는 어디에도 사용가능하므로 instanceof로 구분시켜준다
		if(obj7 instanceof Dog) System.out.println(((Dog)obj7).kind);
		if(obj7 instanceof Animal) System.out.println(((Animal)obj7).kind);
		if(obj7 instanceof String) System.out.println(((String)obj7).toUpperCase());

	}

}
