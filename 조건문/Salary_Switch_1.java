import java.util.Scanner;
public class Salary_Switch_1{
	public static void main( String args[]){
	Scanner scan= new Scanner(System.in);

	int currentSalary = Integer.parseInt( args[0]);
	String rating = args[1];

	System.out.println("현 연봉 : "+currentSalary);
	System.out.println("근무평가등급 : "+rating);

	double raise = 0.0;
	double newSalary = 0.0;

	//
	double pt;
	switch(rating)
	{
	case "우수": pt=0.06;
	case "보통": pt=0.04;
	case "불량": pt=0.02;
	}

	raise = currentSalary*pt;
	newSalary = currentSalary+raise;

	System.out.println("연봉 인상액 : "+(int)raise);
	System.out.println("새 연봉 : "+(int)newSalary);
	//

	}
}

	/*
	switch(rating)
	{
	case "우수": int pt=0.06;
	case "보통": int pt=0.04;
	case "불량": int pt=0.02;
	}

	raise = currentSalary*pt;
	newSalary = currentSalary+raise;

	System.out.println("연봉 인상액 : "+(int)raise);
	System.out.println("새 연봉 : "+(int)newSalary);
	*/

	/*
	switch(rating)
	{
	case "우수": 
		raise = currentSalary*0.06;
		newSalary = currentSalary+raise;
		break;

	case "보통":
		raise = currentSalary*0.04;
		newSalary = currentSalary+raise
		break;

	case "불량": 
		raise = currentSalary*0.02;
		newSalary = currentSalary+raise
		break;
	}

	System.out.println("연봉 인상액 : "+(int)raise);
	System.out.println("새 연봉 : "+(int)newSalary);
	*/