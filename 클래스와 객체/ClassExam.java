package Class;

public class ClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.name = "������";
		kim.grade = 2;
		kim.number = 14;
		kim.telephone = "123-345-6789";
		System.out.println("�л����� : "+kim.name+" "+kim.grade+"�г� "+kim.number+"�� "+kim.telephone);
	}

}

class Student{
	String name;		//��� ��������� ���������ڴ� default�̴�.
	int grade;			//���� ������ ��Ű��, ���� Ŭ���������� ������ �����ϴ�.
	int ban;
	int number;
	String telephone;
}