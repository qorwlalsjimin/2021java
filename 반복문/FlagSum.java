import java.util.Scanner;
public class FlagSum {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
	
		int num;
		int sum = 0;

		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int n = scan.nextInt();			

		for ( num = 1 ; num <= n ; num++)
			if (num==1){	System.out.print(num);
					sum += num;}
			else if (num % 2 != 0){ 	sum += num;
						System.out.print( "+"+num );}

			else 			{sum -= num;
						System.out.print( "-"+num);}

		System.out.println( "="+sum );
	
	}
}

