//절댓값 구하는 프로그램
import java.util.Scanner;

public class Program2{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	int a;
	System.out.print(정수를 입력해주세요 : );
	a = scan.nextInt();
	System.out.println((a>0)?a:a*-1);
	}
}