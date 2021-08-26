import java.util.Scanner;
public class Fact_method{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		System.out.print(n+"!=");
		int cnt=1, i;
		if(n==0) i = 0;
		else i = 1;
		do{
			cnt*=i;
			if(i!=n) System.out.print(i++ +"*");
			else System.out.print(i++);
		}
		while(i<=n);

		System.out.print("="+cnt);
	}
}