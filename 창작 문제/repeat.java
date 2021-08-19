import java.util.Scanner;
public class repeat{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("╪Ж ют╥б : ");
		int n = scan.nextInt();
		for(int i = 0; i<=n-1; i++){
			for(int k = n-2; k>=i; k--)
				System.out.print(" ");
			for(int a = i; a<=i ; a++){
				System.out.print((char)(a+65));
				a++;
			}
			for(int j = 1; j<=i; j++)
				System.out.print("*");
			
		System.out.println();
		}

	}
}
/*
   A
  B*
 C**
D***
*/