import java.util.Scanner;
public class SwitchExam5{
	public static void main( String args[]){
	Scanner scan= new Scanner(System.in);

	System.out.print("반 입력 : ");
	int Sclass = scan.nextInt();

	switch(Sclass)
	{
	case 1: case 2: System.out.println("뉴미디어소프트웨어과");
			break;
	case 3: case 4: System.out.println("뉴미디어웹솔루션과");
			break;
	case 5: case 6: System.out.println("뉴미디어디자인과");
			break;
	default : System.out.println("입력된 반은 존재하지 않습니다.");
	}
	

	}
}
