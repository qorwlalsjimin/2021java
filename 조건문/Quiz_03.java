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
		char c = scan.next().charAt(0);
		System.out.println( (c>=97) ? c : (c<65) ? c : (char)(c+32) );
		
	}
	
}
