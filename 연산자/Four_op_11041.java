import java.util.Scanner;

public class Four_op_11041{
	public static void main( String arsg[]){

			
		String name;

		System.out.print("�̸��� �Է����ּ��� : ");

		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();	
		System.out.println(name);

		int a;
		double b; 

		System.out.print("������ �Է����ּ��� : ");

		a = scan.nextInt();

		System.out.print("�Ǽ��� �Է����ּ��� : ");

		b = scan.nextDouble();

		System.out.println(a+ " + " +b+ " = " + (a+b));
		System.out.println(a+ " - " +b+ " = " + (a-b));
		System.out.println(a+ " * " +b+ " = " + (a*b));
		System.out.println(a+ " / " +b+ " = " + (a/b));

	

	}
}