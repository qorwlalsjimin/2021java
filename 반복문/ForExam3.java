import java.util.Scanner;
public class ForExam3{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	int sum = 0 ;
	System.out.print("�� �Է� : ");
	int num = scan.nextInt();

	//System.out.print("1-2+3-4+5-6+7-8+9-10=");
	System.out.print("�� : ");
	for(int i = 1; i <= num; i++)
		if( i % 2 == 0) sum -= i;
		else sum += i;
	System.out.println(sum);

	}
}