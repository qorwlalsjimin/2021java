//¦�� Ȧ�� ���� ���α׷�
import java.util.Scanner;

public class CondOp_Test{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	int a;
	System.out.print("������ �Է����ּ��� : ");
	a = scan.nextInt();
	System.out.println((a%2==0)?a+"�� ¦���Դϴ�.":a+"�� Ȧ���Դϴ�.");
	}
}