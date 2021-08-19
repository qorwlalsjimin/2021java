import java.util.Scanner;
public class EachOther{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("두 정수를 입력하시오 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int cul;
		if(a>b) cul = a;
		else cul = b;
		int signal=0;

		for(int i = 2; i<=cul; i++){ //50 100
			if(a%i==0 && b%i==0){
				System.out.println(a+"와 "+b+"는 서로소가 아닙니다.");
				break;
			}
			else
				signal=1;
		}
		if(signal==1) System.out.println(a+"와 "+b+"는 서로소입니다.");
	}
}