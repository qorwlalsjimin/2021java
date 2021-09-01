import java.util.Scanner;
public class Gcd{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("공백을 두고 두 수를 입력하시오. >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result=0;

		int i = 1;
		do{
			if(a%i==0 && b%i==0)
				if(i>result) result = i;
			i++;
		}
		while(i<=a); //i=b도 가능

		System.out.println("최대 공약수 : "+result);
	}
}