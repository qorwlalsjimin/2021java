import java.util.Scanner;
public class _1104_if2{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.println("오늘의 요일을 입력하세요.");
	System.out.print("SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) : ");
	int day = scan.nextInt();

	if (day==0)
		System.out.println("오늘은 SUNDAY입니다.");
	else if (day==1)
		System.out.println("오늘은 MONDAY입니다.");
	else if (day==2)
		System.out.println("오늘은 TUEDAY입니다.");
	else if (day==3)
		System.out.println("오늘은 WENDAY입니다.");
	else if (day==4)
		System.out.println("오늘은 THUDAY입니다.");
	else if (day==5)
		System.out.println("오늘은 FRIDAY입니다.");
	else if (day==6)
		System.out.println("오늘은 SATDAY입니다.");
	else 
		System.out.println("요일을 잘못 입력하셨습니다.");

	}
}