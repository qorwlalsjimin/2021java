package Study;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {

		//for문을 이용해서 문자형 숫자를 입력받아서 각 자리의 합을 구하시오.
		
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
