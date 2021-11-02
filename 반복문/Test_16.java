package Study;

import java.util.Scanner;

public class Test_16 {

	public static void main(String[] args) {
		// 0~100사이의 정수를 사용자로부터 여러 개 입력받아서 합, 평균, 입력 갯수를 출력하시오
		// 단 0보다 작은 값이 입력되면 프로그램을 종료하고
		// 100보다 큰 수는 갯수, 합, 평균에서 제외하며 다음 값을 입력 받을 것
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
		
		System.out.println("갯수 : "+cnt+", 합 : "+tot+", 평균 : "+avr);

	}

}
