package Study;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		//����ڷκ��� ������ �ѱ��ڸ� �Է¹޾Ƽ�
		//�ҹ��ڳ� ���ڸ� �Է¹����� �״�� ���
		//�빮�ڴ� �ҹ��ڷ� ��ȯ�ؼ� ���
		//Hint : String Ŭ������ charAt() �޼��� �̿�
		//�ݵ�� ���� �����ڸ� ����� ��
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		
//		String c = scan.next();
//		char ch = c.charAt(0); //��ȣ ���� ���ڴ� ���° ���ڸ� ĳ���� �� �������� ���Ѵ�. 
		char ch = scan.next().charAt(0);
		
		char result;
		result = (ch>='A' && ch<='Z') ? (char)(ch+32) : ch;
		System.out.println("���� ���� : "+result);

		System.out.println( (ch>=97) ? ch : (ch<65) ? ch : (char)(ch+32) );
		
		
	}
	
}
