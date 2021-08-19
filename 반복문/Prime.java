import java.util.Scanner;
public class Prime {
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = scan.nextInt();
		int iresult=0;

	
		for( int i=1; i<=n; i++) {
			if (n%i==0){
				iresult += 1;
			}	
		}

		if (iresult == 2)
			System.out.println(n+"은 소수이다.");
		else
			System.out.println(n+"은 소수가 아니다.");

	}
}

/*
소수 : 1과 자신만을 약수로 가지는 수. 약수가 2개임. 3개이상 ㄴㄴ
약수가 나올 때마다 카운팅
2/1 2/2
3/1 (3/2)  3/3
4/1 4/2   (4/3) 4/4
5/1 (5/2) (5/3) (5/4) 5/5
6/1 6/2   6/3  (6/4) 6/5
*/