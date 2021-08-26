import java.util.Scanner;
public class Fact_method{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		System.out.print(n+"!=");
		int i=1, cnt=1;
		do{
			cnt*=i;
			if(i!=n) System.out.print(i+"*");
			else System.out.print(i);
			i++;	
		}
		while(i<=n);

		System.out.print("="+cnt);
	}
}