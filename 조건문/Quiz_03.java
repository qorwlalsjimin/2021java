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
		char c = scan.next().charAt(0);
		System.out.println( (c>=97) ? c : (c<65) ? c : (char)(c+32) );
		
	}
	
}
