public class Apple{
	public static void main( String args[]){

		int x=4; //ö��
		int y=2; //����

		for(int i = 1; i<=100; i++){
			if( (x-1)==(y+1) && (x+1)==2*(y-1))
				System.out.print("ö�� : "+x+"��\n"+"���� : "+y+"��");
			x++;
			y++;
		}

	}
}