package Class;

class Box{
	//멤버변수
	int width;
	int height;
	int depth;
	
	int cal(){
		return width*height*depth;
	}
}
public class TwoBox {

	public static void main(String[] args) {

		Box b1 = new Box();
		b1.width = 1;
		b1.height = 2;
		b1.depth = 3;
		System.out.println("첫번째 box : "+b1.cal());
		
		Box b2 = new Box();
		b2.width = 4;
		b2.height = 5;
		b2.depth = 6;
		System.out.println("두번째 box : "+b2.cal());

	}

}
