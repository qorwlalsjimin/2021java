public class Apple{
	public static void main( String args[]){

		int x=4; //Ã¶¼ö
		int y=2; //¿µÈñ

		for(int i = 1; i<=100; i++){
			if( (x-1)==(y+1) && (x+1)==2*(y-1))
				System.out.print("Ã¶¼ö : "+x+"°³\n"+"¿µÈñ : "+y+"°³");
			x++;
			y++;
		}

	}
}