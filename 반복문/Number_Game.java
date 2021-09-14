package Study;
import java.util.Scanner;
public class Number_Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0, num;
		int m;
		num = (int)(Math.random()*10+1);

		do{
			System.out.print("숫자 입력 >> ");
			m = scan.nextInt();
			cnt++;
			
			if(m>num)
				System.out.println("down!");
			else if(m<num)
				System.out.println("up!");
		}while(m!=num);
		
		if(cnt<=4)
			System.out.println("Great");
		else if(cnt<=8)
			System.out.println("Good");
		else
			System.out.println("노력하세요.");

	}

}
