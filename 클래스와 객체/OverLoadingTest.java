package Class;

class Test{
	void show(String str) {
		System.out.println("�Ű������� ���޵� : "+str);
	}
	void show() {
		System.out.println("������ �̸��� �޼��尡 �־ ������ �ƴմϴ�. �Ű������� �ٸ� �������̵� �� �޼����Դϴ�. ");
	}
	//��� ������ �ְų� ��� �޼��常 �־ ��� ����
}

public class OverLoadingTest {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.show();
		t1.show("mirim");

	}

}
