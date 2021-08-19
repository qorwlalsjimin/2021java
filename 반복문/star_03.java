public class star_03 {
	public static void main( String args[]){

	for(int i = 1; i<=5; i++){
		for ( int k=2; k<=i; k++ )
			System.out.print(" ");

		for(int j=5; j>=i; j--)
			System.out.print("*");

		System.out.println( );
	}

	}
}

/*
*****
 ****
  ***
   **
    *
*/

/*
00000
10000
11000
11100
11110
*/

/*
{ //i = 5
		for(int j = 1; j<=i; j++) //i=5 j=1
			System.out.print("0");

		System.out.println( );
	}
*/