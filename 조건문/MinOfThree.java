import java.util.Scanner;
public class MinOfThree{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("ù ��° �� �Է� : ");
	int one = scan.nextInt();

	System.out.print("�� ��° �� �Է� : ");
	int two = scan.nextInt();

	System.out.print("�� ��° �� �Է� : ");
	int three = scan.nextInt();

	System.out.print(one+"�� "+two+"�� "+three+" �� ���� ���� ���� ");
	
	/*
	if (one<two && one<three) System.out.print(one);
		else	if(two<one && two<three) System.out.print(two);
				else System.out.print(three);
	*/

	if (one<two)
		if (one<three) System.out.print(one);
		else System.out.print(three);
	else	
		if (two<three) System.out.print(two);
		else System.out.print(three); 

	System.out.print("�Դϴ�. ");
	System.out.print("\n");
	}
}

