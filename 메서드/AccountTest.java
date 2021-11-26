package Class;

class Account{
	private int accountnum;
	private int balance;
	static int baseaccnum = 100; //static :클래스 변수 
	
	Account(){
		accountnum += ++baseaccnum;
	}
	
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
		
		System.out.println(acc1.toString());
		acc1.deposit(5000);
		System.out.println(acc1.toString());
		acc1.withdraw(2000);
		System.out.println(acc1.toString());
		acc1.withdraw(3500);
		System.out.println(acc1.toString());
		
		Account acc2 = new Account();
		System.out.println(acc2.toString());
	}

}
