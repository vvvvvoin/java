package day06;
/**
 * 
 * @author vvvvvvvoin
 * @since 2019.12
 */
public class Account {
	private String name;
	private String number;
	private int money;

	public Account() {
		this("", "", 0);//첫 라인에만 허용됨
//		setName("");
//		setNumber("");
//		setMoney(0);
	}
	public Account(String name, String number, int money) {
		setName(name);
		setNumber(number);
		setMoney(money);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * 
	 * @param money 입금 금액
	 */
	public void input(int money) {
		this.money += money;
	}

	/**
	 * 
	 * @param money 출금금액
	 * @return 출금액
	 */
	public int outut(int money) {
		if (this.money >= money) {
			this.money -= money;
			return money;
		} else
			return 0;
	}

	/**
	 * 계좌정보 출력
	 */
	public void print() {
		System.out.printf("성명  : %s, 계좌번호 : %s, 잔고 : %7d원 %n", name, number, money);

	}
	
	/**
	 * 계좌이체
	 * @param from 출금될 계좌 
	 * @param to 입금될 계좌
	 * @param money 계좌이체 금액
	 */
	public static void transfer(Account from, Account to, int money) {
		System.out.println("계좌이체");
		System.out.println(from.number + " -> " + to.number);
		to.input(from.outut(money));
	}
	
	

}



















