package Study;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {

		//for���� �̿��ؼ� ������ ���ڸ� �Է¹޾Ƽ� �� �ڸ��� ���� ���Ͻÿ�.
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0; i<str.length(); i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
		
//		Scanner scan = new Scanner(System.in);
//		String n = scan.next();
//		char nn;
//		int length = n.length();
//		
//		int tot = 0;
//		for(int i = 0; i<length; i++) {
//			nn = n.charAt(i);
//			tot += nn-'1'+1;
//		}
//		System.out.println(tot);

	} //main

}
