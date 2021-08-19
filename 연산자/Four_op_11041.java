import java.util.Scanner;

public class Four_op_11041{
	public static void main( String arsg[]){

			
		String name;

		System.out.print("이름을 입력해주세요 : ");

		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();	
		System.out.println(name);

		int a;
		double b; 

		System.out.print("정수를 입력해주세요 : ");

		a = scan.nextInt();

		System.out.print("실수를 입력해주세요 : ");

		b = scan.nextDouble();

		System.out.println(a+ " + " +b+ " = " + (a+b));
		System.out.println(a+ " - " +b+ " = " + (a-b));
		System.out.println(a+ " * " +b+ " = " + (a*b));
		System.out.println(a+ " / " +b+ " = " + (a/b));

	

	}
}