package Study;

public class Apple {

	public static void main(String[] args) {
		int x; //ö��
		int y; //����

		for(x=1; x<=100; x++){
			for(y = 1; y<=100; y++){
				if(x-1 == y+1 && x+1 == (y-1)*2)
						System.out.println("ö�� = "+x+"\n���� = "+y);
			}
		}
		

	}

}
