import java.util.Scanner;
public class Prime {
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int n = scan.nextInt();
		int iresult=0;

	
		for( int i=1; i<=n; i++) {
			if (n%i==0){
				iresult += 1;
			}	
		}

		if (iresult == 2)
			System.out.println(n+"�� �Ҽ��̴�.");
		else
			System.out.println(n+"�� �Ҽ��� �ƴϴ�.");

	}
}

/*
�Ҽ� : 1�� �ڽŸ��� ����� ������ ��. ����� 2����. 3���̻� ����
����� ���� ������ ī����
2/1 2/2
3/1 (3/2)  3/3
4/1 4/2   (4/3) 4/4
5/1 (5/2) (5/3) (5/4) 5/5
6/1 6/2   6/3  (6/4) 6/5
*/