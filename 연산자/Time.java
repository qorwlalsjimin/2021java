import java.util.Scanner;
public class Time{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);
	
	int a;
	System.out.print("�� �Է� : ");
	a = scan.nextInt();

	System.out.println((a/60/60)+"�ð� "+(a%3600/60)+"�� "+(a%60%60)+"���Դϴ�.");

	}
}