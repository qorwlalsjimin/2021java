package Class;

class A{
	String name = "class A";
	void show() {
		System.out.println("�̸� : "+name);
	}
}
class B extends A{
	void show() {
		System.out.println("�� ������ ��Ӱ��迡 �ִ� Ŭ�������� �޼��� �������̵��� ���� �����Դϴ�.");
		System.out.println("�̸��� ��µɱ��? "+name);
	}
}
public class OverRidingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		a.show();
		b.show();
	}

}
