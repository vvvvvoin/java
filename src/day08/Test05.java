package day08;

public class Test05 {

	public static void main(String[] args) {
		Account a1 = new Account("마루","2040",300);
		Account a2 = new Account("매루","1050",3800);
		Account a3 = new Account("마루","2040",300);

		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
	}

}

class Account extends Object{
	String name;
	String number;
	int money;
	
	public Account() {
		super();
	}

	public Account(String name, String number, int money) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", money=" + money + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	
}