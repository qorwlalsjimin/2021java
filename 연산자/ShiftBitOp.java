public class ShiftBitOp{
	public static void main( String args[]){

	int a = -65;
	int c;

	c=a>>3;
	System.out.println(c);

	c=a<<3;
	System.out.println(c); //250�� �ƴ� 8���� byte������  

	c=a>>>3;
	System.out.println(c);
	}
}

//byte a = 65�� �ߴµ� 250�� ���� ����. 