public class ShiftBitOp{
	public static void main( String args[]){

	int a = -65;
	int c;

	c=a>>3;
	System.out.println(c);

	c=a<<3;
	System.out.println(c); //250이 아닌 8나옴 byte때문에  

	c=a>>>3;
	System.out.println(c);
	}
}

//byte a = 65를 했는데 250이 나온 이유. 