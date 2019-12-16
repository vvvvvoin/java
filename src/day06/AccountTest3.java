package day06;

import javax.swing.JOptionPane;

public class AccountTest3 {

	public static void main(String[] args) {
		Account[] accounts = { new Account("홍길동", "2019-02-08", 10000), new Account("김길동", "2018-11-09", 8000),
				new Account("최길동", "2015-12-12", 5000), new Account("강길동", "2015-06-01", 100),
				new Account("고길동", "2017-02-28", 2000) };
		System.out.println("Account List 출력");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}

		System.out.println("Account 검색");
		String name = JOptionPane.showInputDialog("검색할 이름을 입력하세요");
		for (int i = 0; i < accounts.length; i++) {
			if (name.trim().equalsIgnoreCase(accounts[i].getName())) {
				accounts[i].print();
			}
		}

	}

}
