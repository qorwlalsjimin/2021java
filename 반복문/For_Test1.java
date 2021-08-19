public class For_Test1{
	public static void main( String args[]){

	for (int i = 1; i<=100; i++){
		if (i<10) {
			if(i==3 || i==6 || i==9)
				System.out.print("X ");
			else
				System.out.print(i+" ");
		}

		else {
			if(i%10==3 || i%10==6 || i%10==9)
				System.out.print("X ");
			else
				System.out.print(i+" ");
		}
	}

	}
}