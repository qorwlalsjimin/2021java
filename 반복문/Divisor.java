import java.util.Scanner;
public class Divisor{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� >> ");
		int n = scan.nextInt();

		int i = 1;
		do{
			if(n%i==0) System.out.print(i+"\t");
			i++;
		}
		while(i<=n);
	}
}