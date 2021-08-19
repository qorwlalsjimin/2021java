import java.util.Scanner;
public class Time{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);
	
	int a;
	System.out.print("초 입력 : ");
	a = scan.nextInt();

	System.out.println((a/60/60)+"시간 "+(a%3600/60)+"분 "+(a%60%60)+"초입니다.");

	}
}