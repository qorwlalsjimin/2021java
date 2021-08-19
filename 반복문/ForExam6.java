import java.util.Scanner;
public class ForExam6 {
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);

	int su=scan.nextInt();
	for ( int i=1 ; i<=su ; i++) { 
		for(int j=1; j<=i; j++)
			System.out.print("*"); 
		System.out.println( );
	}	

	}
}



