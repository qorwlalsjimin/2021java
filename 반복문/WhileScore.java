//0이 입력될 때까지 score를 입력 받아 점수의 합과 평균을 출력하는 프로그램
import java.util.Scanner;
public class WhileScore{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		int sum=0, cnt=0;
		while(score!=0){
			sum+=score;
			cnt++;
			score = scan.nextInt();
		}
		System.out.print("\n점수의 합 : "+sum);
		System.out.print("\n평균 : "+(double)sum/(double)cnt);
	}
}