//1부터 100까지 합을 출력하는 프로그램
import java.util.Scanner;
public class Dowhilesum1to10{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		int i = 1,sum=0;
		do{
			sum+=i;
			i++;
		}while(i<=100);
		System.out.print(sum);
	}
}