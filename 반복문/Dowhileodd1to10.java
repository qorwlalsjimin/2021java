//1부터 100사이의 홀수 출력
import java.util.Scanner;
public class Dowhileodd1to10{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		int i = 1;
		do{
			if(i%2!=0)System.out.print(i+" " );
			i++;
		}while(i<=100);
	}
}