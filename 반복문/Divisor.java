import java.util.Scanner;
public class Divisor{
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� >> ");
		int n = scan.nextInt();
		div(n);

	}
	static void div(int s){
		int i = 1;
		do{
			if(s%i==0) System.out.print(i+"\t");
			i++;
		}
		while(i<=s);
	}
}