import java.util.Scanner;
public class For_Test5{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int sum = 0;

		for(int i = 1; i<11; i++){
			if(i==1) System.out.print("1 + ");
			else if (i==10) System.out.print("( "+i+" * "+i+" ) = "); 
			else System.out.print("( "+i+" * "+i+" ) + ");
			sum+=i*i;
		}
		System.out.print(sum);
	}
}