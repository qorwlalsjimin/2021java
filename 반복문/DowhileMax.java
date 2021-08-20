//0이 입력될 때까지 양수를 입력받고 입력 받은 수 중 최대값을 구하는 프로그램
import java.util.Scanner;
public class DowhileMax{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		int num, max=0;
		System.out.print("양수 입력 : ");
		do{
			num = scan.nextInt();
			if(num>max) max=num;
		}while(num!=0);
		System.out.print("최대값:"+max);
	}
}