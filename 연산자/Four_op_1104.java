import java.util.Scanner;

public class Four_op_1104{
	public static void main( String arsg[]){

		Scanner scan = new Scanner(System.in);			
		String name;


		name = scan.nextLine();
		System.out.print("이름을 입력해주세요 : ");	
		System.out.println(name);

		int a;
		double b; 


		a = scan.nextInt();
		b = scan.nextDouble();

		System.out.println(a+ " + " +b+ " = " + (a+b));
		System.out.println(a+ " - " +b+ " = " + (a-b));
		System.out.println(a+ " * " +b+ " = " + (a*b));
		System.out.println(a+ " / " +b+ " = " + (a/b));

	

	}
}