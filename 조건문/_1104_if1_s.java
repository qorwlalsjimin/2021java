import java.util.Scanner;
public class _1104_if1_s{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("����(1), ����(2), ��(3) �Է� : ");
	int H = scan.nextInt();

	switch(H){
		case 1: System.out.println("����� ������ ���̽��ϴ�."); break;
		case 2: System.out.println("����� ������ ���̽��ϴ�."); break;
		case 3: System.out.println("����� ���� ���̽��ϴ�."); break;
		default: System.out.println("�߸� ���̽��ϴ�.");
	}


	}
}

