import java.util.Scanner;
public class Salary_Switch{
	public static void main( String args[]){
	Scanner scan= new Scanner(System.in);

	System.out.print("�� ������ �Է��ϼ��� : ");
	double currentSalary = scan.nextDouble();

	System.out.print("�ٹ��򰡵���� �Է��ϼ��� : ");
	String rating = scan.next();

	double raise = 0.0;
	double newSalary = 0.0;

	switch(rating)
	{
	case "���": 
		raise = currentSalary*0.06;
		newSalary = currentSalary*1.06; //currentSalary+raise;�� �� ����
		break;

	case "����":
		raise = currentSalary*0.04;
		newSalary = currentSalary*1.04;
		break;

	case "�ҷ�": 
		raise = currentSalary*0.02;
		newSalary = currentSalary*1.02;
		break;
	}
	
	System.out.println("���� �λ�� : "+(int)raise);
	System.out.println("�� ���� : "+(int)newSalary);

	}
}

/*
	switch(raiting){

}