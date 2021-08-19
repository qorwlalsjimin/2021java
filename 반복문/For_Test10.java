public class For_Test10{
	public static void main( String args[]){

		int cnt=1;
		for(int j = 2; j<=20; j++){
			System.out.print(cnt+"+"+j+"="+(cnt+j));
			cnt+=j;
			System.out.println();
		}
		
	}
}