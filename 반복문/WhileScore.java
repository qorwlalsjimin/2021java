//0�� �Էµ� ������ score�� �Է� �޾� ������ �հ� ����� ����ϴ� ���α׷�
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
		System.out.print("\n������ �� : "+sum);
		System.out.print("\n��� : "+(double)sum/(double)cnt);
	}
}