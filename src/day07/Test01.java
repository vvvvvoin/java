package day07;

public class Test01 {

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal d2 = new Animal();
		d.print();
		System.out.println(d.kind);
		System.out.println(d.getSuperKind()); // 메인 메소드에서는 this, super 사용불가
		System.out.println(((Animal) d).kind);// 하지만 업캐스팅으로 형변환을 통해 접근가능하다
		System.out.println(((Dog) d2).kind);// 하지만 다운캐스팅으로 형변환을 통해 접근가능하다

		// is a 관계
		// 모슨 객체의 데이터 타입은 부모가 될 수 있다

	}

}
