package Study;
import java.util.Scanner;
public class Number_Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0, num;
		num = (int)(Math.random()*10+1);
		System.out.print("���� �Է� >> ");
		int m = scan.nextInt();
		
		while(m!=num) {
			System.out.print("���� �Է� >> ");
			m = scan.nextInt();
			cnt++;
		}
		
		if(cnt<=4)
			System.out.println("Great");
		else if(cnt<=8)
			System.out.println("Good");
		else
			System.out.println("����ϼ���.");

	}

}
