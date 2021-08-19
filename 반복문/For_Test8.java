import java.util.Scanner;
public class For_Test8{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int cnt = 0;
		for(int i = 13; i<=100; i++){
			if(i%13==0){
				cnt+=1;
				System.out.print(i+" ");
			}
		}
		System.out.print("\n°³¼ö = "+cnt+"°³");
	}
}