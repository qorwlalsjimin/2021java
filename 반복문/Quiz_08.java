package Study;

import java.util.Scanner;

public class Quiz_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int c1, c2, c3;
		int h1, h2, h3;
		int s = 0;
		int b = 0;
		
		c1 = (int)(Math.random()*9)+1;
		do {
			c2 = (int)(Math.random()*9)+1;
		}while(c1==c2);
		
		do {
			c3 = (int)(Math.random()*9)+1;
		}while(c3==c1 || c3==c2);
		
		System.out.println(c1+" "+c2+" "+c3);
		
		int cnt = 0;
		while(s!=3) {
			cnt++;
			System.out.print("숫자 3개를 입력하세요 : ");
			h1 = scan.nextInt();
			h2 = scan.nextInt();
			h3 = scan.nextInt();
			
			s = 0;
			b = 0;
			if(h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;
			
			if(h2 == c2) s++;
			else if(h2 == c1 || h2 == c3) b++;
			
			if(h3 == c3) s++;
			else if(h3 == c1 || h3 == h2) b++;
			
			System.out.println("["+s+"S "+b+"B]");
			System.out.println("축하합니다."+cnt+"번째에 맞추셨습니다.");
			
			if(cnt<=5) System.out.println("Great~~");
			else if(cnt<=10) System.out.println("Good~~");
			else System.out.println("노력하세요.");
		}
		
	}

}
