package day08;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = {
				new Dog("푸들", "마루"),
				new Fish("구피")
		};
		for(Animal data : animals) {
			data.breath();
		}
	}

}
