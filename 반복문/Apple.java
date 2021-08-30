public class Apple{
	public static void main( String args[]){

		int x=4; //철수
		int y=2; //영희

		for(int i = 1; i<=100; i++){
			if( (x-1)==(y+1) && (x+1)==2*(y-1))
				System.out.print("철수 : "+x+"개\n"+"영희 : "+y+"개");
			x++;
			y++;
		}

	}
}