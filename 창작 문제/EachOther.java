import java.util.Scanner;
public class EachOther{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("�� ������ �Է��Ͻÿ� : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int cul;
		if(a>b) cul = a;
		else cul = b;
		int signal=0;

		for(int i = 2; i<=cul; i++){ //50 100
			if(a%i==0 && b%i==0){
				System.out.println(a+"�� "+b+"�� ���μҰ� �ƴմϴ�.");
				break;
			}
			else
				signal=1;
		}
		if(signal==1) System.out.println(a+"�� "+b+"�� ���μ��Դϴ�.");
	}
}