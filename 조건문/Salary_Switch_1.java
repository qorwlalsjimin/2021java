import java.util.Scanner;
public class Salary_Switch_1{
	public static void main( String args[]){
	Scanner scan= new Scanner(System.in);

	int currentSalary = Integer.parseInt( args[0]);
	String rating = args[1];

	System.out.println("�� ���� : "+currentSalary);
	System.out.println("�ٹ��򰡵�� : "+rating);

	double raise = 0.0;
	double newSalary = 0.0;

	//
	double pt;
	switch(rating)
	{
	case "���": pt=0.06;
	case "����": pt=0.04;
	case "�ҷ�": pt=0.02;
	}

	raise = currentSalary*pt;
	newSalary = currentSalary+raise;

	System.out.println("���� �λ�� : "+(int)raise);
	System.out.println("�� ���� : "+(int)newSalary);
	//

	}
}

	/*
	switch(rating)
	{
	case "���": int pt=0.06;
	case "����": int pt=0.04;
	case "�ҷ�": int pt=0.02;
	}

	raise = currentSalary*pt;
	newSalary = currentSalary+raise;

	System.out.println("���� �λ�� : "+(int)raise);
	System.out.println("�� ���� : "+(int)newSalary);
	*/

	/*
	switch(rating)
	{
	case "���": 
		raise = currentSalary*0.06;
		newSalary = currentSalary+raise;
		break;

	case "����":
		raise = currentSalary*0.04;
		newSalary = currentSalary+raise
		break;

	case "�ҷ�": 
		raise = currentSalary*0.02;
		newSalary = currentSalary+raise
		break;
	}

	System.out.println("���� �λ�� : "+(int)raise);
	System.out.println("�� ���� : "+(int)newSalary);
	*/