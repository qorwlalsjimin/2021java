package Study;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {

		//for���� �̿��ؼ� ������ ���ڸ� �Է¹޾Ƽ� �� �ڸ��� ���� ���Ͻÿ�.
		
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		char nn;
		int length = n.length();
		
		int tot = 0;
		for(int i = 0; i<length; i++) {
			nn = n.charAt(i);
			tot += nn-'1'+1;
		}
		System.out.println(tot);

	}

}
