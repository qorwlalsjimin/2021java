import java.util.Scanner;
public class SwitchExam4_1{
	public static void main( String args[]){
	Scanner scan= new Scanner(System.in);

	System.out.print("월 입력 : ");
	int num = scan.nextInt();
	int day;

	switch(num){
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12:
			day = 31; break;
		case 4 : case 6 : case 9 : case 11 :
			day = 30; break;
		default : day = 28;
	}
	System.out.println(num + "월은 " + day + "일입니다.");

	}
}