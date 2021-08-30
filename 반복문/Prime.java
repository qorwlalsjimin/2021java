import java.util.Scanner;
public class Prime{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. >> ");
		int n = scan.nextInt();
		int cnt = 0;
		int i = 1;
		do{
			if(n%i==0) 
				cnt++;
			i++;
		}
		while(i<=n);

		if(cnt==2) System.out.println("소수이다.");
		else System.out.println("소수가 아니다.");
	}
}