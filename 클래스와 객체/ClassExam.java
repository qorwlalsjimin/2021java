package Class;

public class ClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.name = "������";
		kim.grade = 2;
		kim.number = 14;
//		kim.telephone = "123-345-6789";
		kim.Set_tel("123-345-6789");
//		System.out.println("�л����� : "+kim.name+" "+kim.grade+"�г� "+kim.number+"�� "+kim.telephone);
		System.out.println("�л����� : "+kim.name+" "+kim.grade+"�г� "+kim.number+"�� "+kim.Get_tel());
	}

}

class Student{
	String name;		//��� ��������� ���������ڴ� default�̴�.
	int grade;			//���� ������ ��Ű��, ���� Ŭ���������� ������ �����ϴ�.
	int ban;
	int number;
	private String telephone; //private�� ���� �ش� Ŭ���������� ��� ���� => �� ���� �ʹٸ� �޼��带 �������� //�����ڴ� ���� private�ϸ� �� ��=>�ƹ������� ��ü�� �������.
	
	void Set_tel(String tel){
		telephone = tel;
	}
	
	String Get_tel() {
		return telephone;
	}
}