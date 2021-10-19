package Study;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		//사용자로부터 영문자 한글자를 입력받아서
		//소문자나 숫자를 입력받으면 그대로 출력
		//대문자는 소문자로 변환해서 출력
		//Hint : String 클래스의 charAt() 메서드 이용
		//반드시 삼항 연산자를 사용할 것
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		
//		String c = scan.next();
//		char ch = c.charAt(0); //괄호 안의 숫자는 몇번째 글자를 캐스팅 할 것인지를 뜻한다. 
		char ch = scan.next().charAt(0);
		
		char result;
		result = (ch>='A' && ch<='Z') ? (char)(ch+32) : ch;
		System.out.println("변한 숫자 : "+result);

		System.out.println( (ch>=97) ? ch : (ch<65) ? ch : (char)(ch+32) );
		
		
	}
	
}
