import java.util.Scanner;
public class For_Test7{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("���ڸ� �Է��Ͻÿ�. ");
		int n = scan.nextInt();
		for(int i = 0; i<=n-1; i++){
			for(int j = 90; j>=90-i; j--)
				System.out.print((char)(j));
			System.out.println();
		}
	}
}