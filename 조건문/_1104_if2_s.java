import java.util.Scanner;
public class _1104_if2_s{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.println("������ ������ �Է��ϼ���.");
	System.out.print("SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) : ");
	int day = scan.nextInt();

	switch(day) {
		case 0: System.out.println("������ SUNDAY�Դϴ�."); break;
		case 1: System.out.println("������ MONDAY�Դϴ�.");
		case 2: System.out.println("������ TUEDAY�Դϴ�.");
		case 3: System.out.println("������ WENDAY�Դϴ�.");
		case 4: System.out.println("������ THUDAY�Դϴ�.");
		case 5: System.out.println("������ FRIDAY�Դϴ�.");
		case 6: System.out.println("������ SATDAY�Դϴ�.");
		default: System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
	}


	}
}