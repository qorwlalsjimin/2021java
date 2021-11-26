package Class;

class Account{
	String accountnum;
	int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if(money>balance)
			System.out.println("잔액이 부족합니다.");
		else
			balance -= money;
	}
	
	public String toString() {
		return accountnum+" "+balance;
	}
}

public class AccountTest {

	public static void main(String[] args) {

		Account acc1 = new Account();
		acc1.accountnum = "101";
		System.out.println(acc1.toString());
		acc1.deposit(5000);
		System.out.println(acc1.toString());
		acc1.withdraw(2000);
		System.out.println(acc1.toString());
		acc1.withdraw(3500);
		System.out.println(acc1.toString());
	}

}
