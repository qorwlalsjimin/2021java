//1달러=1151원 1엔=1042원 1유로=1355원 (2021년 7월 23일 기준)
import java.util.Scanner;
public class Exchange{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("환율할 돈 단위를 입력하시오.(1:dollar, 2:yen, 3:euro) ");
		int unit = scan.nextInt();
		System.out.print("얼마나 환율받을 것인지 숫자만 입력하시오. ");
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

		System.out.println(rate*won+"원이 필요합니다.");
	}
}