import java.util.Scanner;
public class recipe{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("두부 : ");
	int du = scan.nextInt();
	System.out.print("애호박 : ");
	int ae= scan.nextInt();
	System.out.print("양파 : ");
	int on= scan.nextInt();
	int Cnt = 0; //몇 인분
	int duC = du/1; 
	int aeC = ae/2;
	int onC = on/3; 

	
	if(duC>aeC) Cnt=aeC;
	else Cnt=duC;

	if(Cnt>onC) Cnt=onC;

	System.out.println("\n두부 "+du+"모, 애호박 "+ae+"개, 양파 "+on+"개");
	System.out.println("총 "+Cnt+"인분의 된장찌개를 만들 수 있습니다.");
	
	}
}