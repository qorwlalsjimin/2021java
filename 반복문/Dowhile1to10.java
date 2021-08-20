//1부터 10까지 출력
import java.util.Scanner;
public class Dowhile1to10{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		int i = 1;
		do{
			System.out.print(i+" " );
			i++;
		}while(i<=10);
	}
}