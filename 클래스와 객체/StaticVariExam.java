package Class;

public class StaticVariExam {

	public static void main(String[] args) {

		System.out.println("������ �л� ��ü ���� "+Student1.count+"�Դϴ�.");
		Student1 kim = new Student1();
		System.out.println("������ �л� ��ü ���� "+Student1.count+"�Դϴ�.");
		System.out.println("������ �л� ��ü ���� "+kim.count+"�Դϴ�.");
		Student1 jang = new Student1();
		System.out.println("������ �л� ��ü ���� "+Student1.count+"�Դϴ�.");
		//System.out.println("������ �л� ��ü ���� "+bak.count+"�Դϴ�.");
		Student1 bak = new Student1();
		System.out.println("������ �л� ��ü ���� "+Student1.count+"�Դϴ�.");

	}

}

class Student1{
	String name;
	int grade;
	static int count = 0;
	public Student1() {
		count++;
	}
}