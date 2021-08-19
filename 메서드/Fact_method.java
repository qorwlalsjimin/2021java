import java.util.Scanner;
public class Fact_method {
	public static void main( String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();

		int result=1;
		System.out.print(num+"!=");

		for(int i=1; i<=num; i++){
			 
			if(i != num) {
				System.out.print(i+"*");
				result *= i;
			}
			else {
				System.out.print(i);
				result *= i;
			}
		}
		System.out.println("="+result);



	}
}