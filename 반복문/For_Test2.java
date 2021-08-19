//...¡Àº€«’¥œ¥Ÿ ...............................................................
public class For_Test2{
	public static void main( String args[]){
	
	/*
	for( int i = 1; i<=10; i++){
		for( int k=1; k<=i; k++){
			if(i!=10) System.out.print("0"+i);
			else System.out.print(i);

			if(i==2 || i==4 || i==7 || i==8) {
				i++;
				k++;
			}
			else if(i==5){
				i++;
				k+=2;
			}
			else if(i==9){
				i++;
				k+=4;
			}
		}
		System.out.println();
	}
	*/
	

	
	int cnt = 1;
	for(int i=1; i<=4; i++) {
		for(int j=1; j<=i; j++) {

			if(cnt==10) System.out.print(cnt);
			else System.out.print("0"+cnt);

			cnt++;
		}	

		System.out.println();
	}
	

}
}

/*
1
2 3
4 5 6
7 8 9 10
*/

/*
   +2    +2       +2             +2
  2   4 5   7 8 9    11 12 13 14     16
1   3     6       10             15
  +2   +3    +4           +5
*/