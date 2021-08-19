public class star_05 {
	public static void main( String args[]){

	for (int i=1; i<=5; i++){
		for (int j=5; j>i; j--)
			System.out.print("  ");
		for (int k=1 ; k<=i*2-1; k++ ){
			if(k==i) System.out.print((char)('A'+i-1)+" ");
			
			else System.out.print("* ");
		}
		System.out.println();
	}

	}
}

/*
1 1
2 3
3 5
4 7
5 9
6 11
7 13
8 15
9 17
10 19
*/