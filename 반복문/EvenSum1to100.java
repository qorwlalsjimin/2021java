public class EvenSum1to100 {
	public static void main( String args[]){

	int result = 0;
	for ( int i = 1; i<=100; i++) {
		if (i % 2 == 0)
		{
			result += i;
			System.out.print(i + " ");
		}
	}
		System.out.println("\n");
		System.out.println(result);
	}
}