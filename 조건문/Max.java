import java.util.Scanner;
public class Max{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("ù ��° �� �Է� : ");
	int num1 = scan.nextInt();

	System.out.print("�� ��° �� �Է� : ");
	int num2 = scan.nextInt();

	System.out.print(num1+"�� "+num2+" �� ū ���� ");

	if (num1>num2)
		System.out.print(num1);
	else
		System.out.print(num2);

	System.out.println("�Դϴ�.");
	}
}