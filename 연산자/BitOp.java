public class BitOp{
	public static void main(String args[]){
	
	int a = 3;
	int b=5;
	System.out.println(a&b); //1
	System.out.println(a|b); //7
	System.out.println(a^b); //6
	System.out.println(~a); //-4 0이랑 -1 1이랑 -2 2랑 -3 3이랑 -4
	System.out.println(~b); //-6

	System.out.println(3<<2); //3을 왼쪽으로 2칸 이동=3*2*2 0011->1100
	System.out.println(5<<3); //5*2*2*2
	System.out.println(12>>2); //12/2/2
	System.out.println(15>>3); //1111 오른쪽으로 3칸 0001 1

	System.out.println(-17>>2); //1로 채움 -5
	System.out.println(-17>>>2); //0으로 채움 1073741819

	System.out.println(17>>2); //0으로 채움 4
	System.out.println(17>>>2); //0으로 채움 4
	}
}
