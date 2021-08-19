import java.util.Scanner;
public class _1104_if1{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
	int H = scan.nextInt();

	if (H==1)
		System.out.println("당신은 가위를 내셨습니다.");

	else if (H==2)
		System.out.println("당신은 바위를 내셨습니다.");

	else if (H==3)
		System.out.println("당신은 보를 내셨습니다.");

	else
		System.out.println("잘못 내셨습니다.");

	}
}

//클래스명 숫자로 시작하면 오류나서 _ 붙였습니다.