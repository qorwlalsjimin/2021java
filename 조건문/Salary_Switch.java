import java.util.Scanner;
public class Salary_Switch{
	public static void main( String args[]){
	Scanner scan= new Scanner(System.in);

	System.out.print("현 연봉을 입력하세요 : ");
	double currentSalary = scan.nextDouble();

	System.out.print("근무평가등급을 입력하세요 : ");
	String rating = scan.next();

	double raise = 0.0;
	double newSalary = 0.0;

	switch(rating)
	{
	case "우수": 
		raise = currentSalary*0.06;
		newSalary = currentSalary*1.06; //currentSalary+raise;가 더 나음
		break;

	case "보통":
		raise = currentSalary*0.04;
		newSalary = currentSalary*1.04;
		break;

	case "불량": 
		raise = currentSalary*0.02;
		newSalary = currentSalary*1.02;
		break;
	}
	
	System.out.println("연봉 인상액 : "+(int)raise);
	System.out.println("새 연봉 : "+(int)newSalary);

	}
}

/*
	switch(raiting){

}