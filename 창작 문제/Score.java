//메서드 연습
import java.util.Scanner;
public class Score{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("수학 점수 : ");
		int m = scan.nextInt();
		System.out.print("영어 점수 : ");
		int e = scan.nextInt();
		System.out.print("국어 점수 : ");
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
		System.out.print("\n보충  수업 : ");
		if(mr==1) System.out.print("수학 ");
		if(er==1) System.out.print("영어 ");
		if(kr==1) System.out.print("국어 ");

		System.out.print("\n재  시  험 : ");
		if(mr==2) System.out.print("수학 ");
		if(er==2) System.out.print("영어 ");
		if(kr==2) System.out.print("국어 ");

		System.out.print("\n오답  정리 : ");
		if(mr==3) System.out.print("수학 ");
		if(er==3) System.out.print("영어 ");
		if(kr==3) System.out.print("국어 ");
		System.out.println();
	}
}