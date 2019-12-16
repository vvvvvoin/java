package day08;

public abstract class Animal {
	protected String kind = "동물의 종류";

	public Animal() {}
	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	abstract void breath();
}
