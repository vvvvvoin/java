package day06;

public class AccountTest2 {

	public static void main(String[] args) {
		Account a1 = new Account("홍길동", "2019-12-09", 10000);
		a1.print();

		Account a2 = new Account("김길동", "2018-12-09", 8000);
		a2.print();
		
		Account a3 = new Account();
		a3.print();
	}

}
