package Study;

import java.util.Scanner;

public class Test_16 {

	public static void main(String[] args) {
		// 0~100������ ������ ����ڷκ��� ���� �� �Է¹޾Ƽ� ��, ���, �Է� ������ ����Ͻÿ�
		// �� 0���� ���� ���� �ԷµǸ� ���α׷��� �����ϰ�
		// 100���� ū ���� ����, ��, ��տ��� �����ϸ� ���� ���� �Է� ���� ��
		Scanner scan = new Scanner(System.in);
		int tot = 0, cnt = 0;
		int i = 0, n; 
		while(true) {
			n = scan.nextInt();
			if(n<0)
				break;
			if(n>100)
				continue;
			cnt++;
			tot+=n;
		}
		
		double avr = (double)tot/cnt;
		
		System.out.println("���� : "+cnt+", �� : "+tot+", ��� : "+avr);

	}

}
