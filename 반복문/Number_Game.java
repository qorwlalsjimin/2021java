package Study;
import java.util.Scanner;
public class Number_Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0, num;
		int m;
		num = (int)(Math.random()*10+1);

//		do{
//			System.out.print("���� �Է� >> ");
//			m = scan.nextInt();
//			cnt++;
//			
//			if(m>num)
//				System.out.println("down!");
//			else if(m<num)
//				System.out.println("up!");
//		}while(m!=num);
		
		while(true) {
			cnt++;
			System.out.print("1~10 ������ ���� �Է� : ");
			m = scan.nextInt();
			
			if(num>m)
				System.out.println("**�� ū ���ڸ� �Է��ϼ���**\n");
			else if(num < m)
				System.out.println("**�� ���� ���ڸ� �Է��ϼ���**\n");
			else if(num == m) {
				System.out.println("**�����Դϴ�.**\n");
				System.out.println(cnt+"��°�� ���߼̽��ϴ�.");
				if(cnt<=4)
					System.out.println("Great");
				else if(cnt<=8)
					System.out.println("Good");
				else
					System.out.println("����ϼ���.");
				break;
		}//while
			
//		if(cnt<=4)
//			System.out.println("Great");
//		else if(cnt<=8)
//			System.out.println("Good");
//		else
//			System.out.println("����ϼ���.");

			
		}
	}

}
