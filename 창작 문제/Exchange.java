//1�޷�=1151�� 1��=1042�� 1����=1355�� (2021�� 7�� 23�� ����)
import java.util.Scanner;
public class Exchange{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("ȯ���� �� ������ �Է��Ͻÿ�.(1:dollar, 2:yen, 3:euro) ");
		int unit = scan.nextInt();
		System.out.print("�󸶳� ȯ������ ������ ���ڸ� �Է��Ͻÿ�. ");
		int won = scan.nextInt();
		int rate = 0;
		switch(unit){
		case 1: rate = 1151;
			break;
		case 2: rate = 1042;
			break;
		case 3: rate = 1355;
			break;
		}

		System.out.println(rate*won+"���� �ʿ��մϴ�.");
	}
}