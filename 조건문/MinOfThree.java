import java.util.Scanner;
public class MinOfThree{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("첫 번째 수 입력 : ");
	int one = scan.nextInt();

	System.out.print("두 번째 수 입력 : ");
	int two = scan.nextInt();

	System.out.print("세 번째 수 입력 : ");
	int three = scan.nextInt();

	System.out.print(one+"와 "+two+"와 "+three+" 중 가장 작은 수는 ");
	
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

	System.out.print("입니다. ");
	System.out.print("\n");
	}
}

