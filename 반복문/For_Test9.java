import java.util.Scanner;
public class For_Test9{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("줄 수 입력 ==> ");
		int n = scan.nextInt();
		int c=1;
		for(int i = 1; i<=n; i++){
			for(int j = c; j<=c+4; j++)
				System.out.print(j);
			System.out.println();
			c+=5;
		}
	}
}