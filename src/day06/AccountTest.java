package day06;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setName("홍길동");
		a1.setNumber("2019-12-09");
		a1.setMoney(10000);
		a1.print();

		Account a2 = new Account();
		a2.setName("김길동");
		a2.setNumber("2018-12-09");
		a2.setMoney(10000);
		a2.print();
		
		
		Account.transfer(a2, a1, 2000);
		//a1.input(a2.outut(2000));
		a1.print();
		a2.print();
	}

}
