import java.util.Scanner;
public class _1104_if2{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.println("������ ������ �Է��ϼ���.");
	System.out.print("SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) : ");
	int day = scan.nextInt();

	if (day==0)
		System.out.println("������ SUNDAY�Դϴ�.");
	else if (day==1)
		System.out.println("������ MONDAY�Դϴ�.");
	else if (day==2)
		System.out.println("������ TUEDAY�Դϴ�.");
	else if (day==3)
		System.out.println("������ WENDAY�Դϴ�.");
	else if (day==4)
		System.out.println("������ THUDAY�Դϴ�.");
	else if (day==5)
		System.out.println("������ FRIDAY�Դϴ�.");
	else if (day==6)
		System.out.println("������ SATDAY�Դϴ�.");
	else 
		System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");

	}
}