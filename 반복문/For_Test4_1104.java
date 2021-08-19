import java.util.Scanner;
public class For_Test4_1104{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.print("╪Ж ют╥б : ");
		int n = scan.nextInt();
		double sum = 0;
	
		for(int i=1; i<=n; i++){
			sum+=1/(double)i;
			if(i==1) System.out.print("1+");
			else if(i==n) System.out.print("(1/"+i+")=");
			else System.out.print("(1/"+i+")+");

		}	
		System.out.print(sum);
	}
}