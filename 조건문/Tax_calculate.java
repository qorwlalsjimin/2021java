import java.util.Scanner;
public class Tax_calculate{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("���� �ٷμҵ� : ");
	int salary = scan.nextInt();

	System.out.print("�ҵ漼 : ");
	if (salary<=20000000) System.out.println((int)(salary*0.05));
	else if (salary<=40000000) System.out.println((int)(salary*0.15));
	else if (salary<=80000000) System.out.println((int)(salary*0.25));
	else System.out.println((int)(salary*0.40));
	}
}