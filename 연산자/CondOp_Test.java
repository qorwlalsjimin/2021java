//짝수 홀수 구분 프로그램
import java.util.Scanner;

public class CondOp_Test{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	int a;
	System.out.print("정수를 입력해주세요 : ");
	a = scan.nextInt();
	System.out.println((a%2==0)?a+"는 짝수입니다.":a+"는 홀수입니다.");
	}
}