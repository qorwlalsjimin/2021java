import java.util.Scanner;
public class RestTime{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		final int h=7;
		final int m=30;
		System.out.print("���� �ð��� �Է��Ͻÿ�. ");
		int ph = scan.nextInt();
		int pm = scan.nextInt();
		int hc, mc;

		if(pm>30){
			if(ph<h) hc = h-(ph+1);
			else hc = (24-(ph+1))+7;
			mc = (m+60)-pm;
		}
		else {
			if(ph<h) hc = h-ph;
			else hc = (24-ph)+7;
			mc = m-pm;
		}
		System.out.println(hc+"�ð� "+mc+"�� �� �˶��� �︳�ϴ�.");
	}
}