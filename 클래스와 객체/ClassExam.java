package Class;

public class ClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.name = "김현우";
		kim.grade = 2;
		kim.number = 14;
//		kim.telephone = "123-345-6789";
		kim.Set_tel("123-345-6789");
//		System.out.println("학생정보 : "+kim.name+" "+kim.grade+"학년 "+kim.number+"번 "+kim.telephone);
		System.out.println("학생정보 : "+kim.name+" "+kim.grade+"학년 "+kim.number+"번 "+kim.Get_tel());
	}

}

class Student{
	String name;		//모든 멤버변수의 접근제어자는 default이다.
	int grade;			//따라서 동일한 패키지, 동일 클래스에서만 접근이 가능하다.
	int ban;
	int number;
	private String telephone; //private를 쓰면 해당 클래스에서만 사용 가능 => 꼭 쓰고 싶다면 메서드를 만들어야함 //생성자는 절대 private하면 안 됨=>아무데서도 객체를 못만든다.
	
	void Set_tel(String tel){
		telephone = tel;
	}
	
	String Get_tel() {
		return telephone;
	}
}