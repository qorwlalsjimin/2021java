import java.util.Scanner;
public class Gcd{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �ΰ� �� ���� �Է��Ͻÿ�. >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result=0;

		int i = 1;
		do{
			if(a%i==0 && b%i==0)
				if(i>result) result = i;
			i++;
		}
		while(i<=a); //i=b�� ����

		System.out.println("�ִ� ����� : "+result);
	}
}