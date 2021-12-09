package Class;
//���������� default�� ��Ű������ �� �� ����
class Accountt{
	private int accountnum;
	private int balance;
	static int baseaccnum = 100; //static :Ŭ���� ���� 
	static final double interest = 0.02;
	
	Accountt(){
		accountnum += ++baseaccnum;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if(money>balance)
			System.out.println("�ܾ��� �����մϴ�.");
		else
			balance -= money;
	}
	
	void fixedDeposit(int money, int year) {
		balance = (int)(money+(money*interest)*3); 
	}
	
	public String toString() {
		return "���¹�ȣ : "+accountnum+" �ܾ� : "+balance;
	}
}

public class AccountTest_02 {

	public static void main(String[] args) {

		//System.out.println("*"+Account.baseaccnum);

		Accountt acc1 = new Accountt();
		//System.out.println("*"+Account.baseaccnum);
		System.out.println("*"+acc1.baseaccnum);
		//baseaccnum�� �θ��� �̸����� �������� ���� ����?
		
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
