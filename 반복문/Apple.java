package Study;

public class Apple {

	public static void main(String[] args) {
		int x; //Ã¶¼ö
		int y; //¿µÈñ

		for(x=1; x<=100; x++){
			for(y = 1; y<=100; y++){
				if(x-1 == y+1 && x+1 == (y-1)*2)
						System.out.println("Ã¶¼ö = "+x+"\n¿µÈñ = "+y);
			}
		}
		

	}

}
