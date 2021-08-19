import java.util.Scanner;
public class Max{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("첫 번째 수 입력 : ");
	int num1 = scan.nextInt();

	System.out.print("두 번째 수 입력 : ");
	int num2 = scan.nextInt();

	System.out.print(num1+"와 "+num2+" 중 큰 수는 ");

	if (num1>num2)
		System.out.print(num1);
	else
		System.out.print(num2);

	System.out.println("입니다.");
	}
}