import java.util.Scanner;
public class For_Test6{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("문자 입력 ==> ");
		char c = scan.next().charAt(0);
		char ch = 'A';
		for(int i = -1; i<=c-66; i++){
			for(int j = 1; j<=2*i+3; j++){
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}

	}
}

/*
A
BBB
CCCCC
*/
