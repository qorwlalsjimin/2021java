//�޼��� ����
import java.util.Scanner;
public class Score{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int m = scan.nextInt();
		System.out.print("���� ���� : ");
		int e = scan.nextInt();
		System.out.print("���� ���� : ");
		int k = scan.nextInt();

		int mr = score(m);
		int er = score(e);
		int kr = score(k);

		result(mr, er, kr);
	}

	public static int score(int a){
		int re=0;
		if(a<40) re++;
		else if(a<70) re+=2;
		else re+=3;

		return re;
	}

	public static void result(int mr, int er, int kr){
		System.out.print("\n����  ���� : ");
		if(mr==1) System.out.print("���� ");
		if(er==1) System.out.print("���� ");
		if(kr==1) System.out.print("���� ");

		System.out.print("\n��  ��  �� : ");
		if(mr==2) System.out.print("���� ");
		if(er==2) System.out.print("���� ");
		if(kr==2) System.out.print("���� ");

		System.out.print("\n����  ���� : ");
		if(mr==3) System.out.print("���� ");
		if(er==3) System.out.print("���� ");
		if(kr==3) System.out.print("���� ");
		System.out.println();
	}
}