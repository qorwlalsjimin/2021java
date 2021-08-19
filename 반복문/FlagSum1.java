import java.util.Scanner;
public class FlagSum1 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
	
		double sum = 0;
		int one;

		System.out.print("숫자를 입력하시오 : ");
		int n = scan.nextInt();			

		for ( int num = 1 ; num <= n ; num++) {

			if (num==1){
				System.out.print(num);
				one = 1;
			}

			else if (num % 2 != 0){ 	
				
				one = 1;
				System.out.print( "+"+num );
			}

			else{ 	
				one = -1;
				System.out.print( "-"+num);
			}

			sum = sum+num*one;
		}
		System.out.println( "="+(int)sum );
	
	}
}

//10 -5
//11 6
