import java.util.Scanner;
public class Prime{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�. >> ");
		int n = scan.nextInt();
		int cnt = 0;
		int i = 1;
		do{
			if(n%i==0) 
				cnt++;
			i++;
		}
		while(i<=n);

		if(cnt==2) System.out.println("�Ҽ��̴�.");
		else System.out.println("�Ҽ��� �ƴϴ�.");
	}
}