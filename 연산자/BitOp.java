public class BitOp{
	public static void main(String args[]){
	
	int a = 3;
	int b=5;
	System.out.println(a&b); //1
	System.out.println(a|b); //7
	System.out.println(a^b); //6
	System.out.println(~a); //-4 0�̶� -1 1�̶� -2 2�� -3 3�̶� -4
	System.out.println(~b); //-6

	System.out.println(3<<2); //3�� �������� 2ĭ �̵�=3*2*2 0011->1100
	System.out.println(5<<3); //5*2*2*2
	System.out.println(12>>2); //12/2/2
	System.out.println(15>>3); //1111 ���������� 3ĭ 0001 1

	System.out.println(-17>>2); //1�� ä�� -5
	System.out.println(-17>>>2); //0���� ä�� 1073741819

	System.out.println(17>>2); //0���� ä�� 4
	System.out.println(17>>>2); //0���� ä�� 4
	}
}
