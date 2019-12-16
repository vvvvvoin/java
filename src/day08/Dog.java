package day08;

public class Dog extends Animal {
	String kind = "강아지 종류";
	String name;
	
	public String getSuperKind() {
		return super.kind;
	}

	public Dog() {
		super("강아지");
	}

	public Dog(String kind, String name) {
		super("강아지");
		//super.kind = "강아지"; 생성자가 대체함
		this.kind = kind;
		this.name = name;
	}


	public void print() {
		System.out.printf("%s, %s, %s %n", super.kind, this.kind, name);
	}

	@Override	//부모의 메쏘드보다 범위가(public, protected 등) 크거나 같아야한다
	protected void breath() {
		System.out.println("폐로 숨쉬기");
		
	}
}