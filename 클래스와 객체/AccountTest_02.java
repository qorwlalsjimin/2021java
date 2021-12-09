package Class;
//접근제어자 default는 패키지까지 쓸 수 있음
class Accountt{
	private int accountnum;
	private int balance;
	static int baseaccnum = 100; //static :클래스 변수 
	static final double interest = 0.02;
	
	Accountt(){
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
	
	void fixedDeposit(int money, int year) {
		balance = (int)(money+(money*interest)*3); 
	}
	
	public String toString() {
		return "계좌번호 : "+accountnum+" 잔액 : "+balance;
	}
}

public class AccountTest_02 {

	public static void main(String[] args) {

		//System.out.println("*"+Account.baseaccnum);

		Accountt acc1 = new Accountt();
		//System.out.println("*"+Account.baseaccnum);
		System.out.println("*"+acc1.baseaccnum);
		//baseaccnum을 부르는 이름으로 적절하지 않은 것은?
		
		System.out.println(acc1.toString());
		acc1.deposit(5000);
		System.out.println(acc1.toString());
		acc1.withdraw(2000);
		System.out.println(acc1.toString());
		acc1.withdraw(3500);
		System.out.println(acc1.toString());
		
		Accountt acc2 = new Accountt();
		//System.out.println("*"+Account.baseaccnum);
		System.out.println(acc2.toString());
		
		Accountt acc3 = new Accountt();
		System.out.println(acc3.toString());
		acc3.fixedDeposit(100000, 3);
		System.out.println(acc3.toString());
		
	}

}
