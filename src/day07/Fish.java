package day07;

public class Fish extends Animal{
	String name;
	
	public Fish() {
		super();
	}

	public Fish(String name) {
		super("물고기	");
		this.name = name;
	}

	public void print() {
		System.out.printf("%s, %s %n", kind, name);
	}
	
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기");
	}
}
