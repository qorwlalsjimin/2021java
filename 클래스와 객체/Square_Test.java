package Class;

class Square{
	int width;
	int heighet;
	
	int area() {
		return width*heighet;
	}
	int length() {
		return width*2+heighet*2;
	}
}

public class Square_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();
		s1.width = (int)(Math.random()*10)+1;
		s1.heighet = (int)(Math.random()*10)+1;
		System.out.println("가로 : "+s1.width+", 세로 : "+s1.heighet);
		System.out.println("사각형의 넓이 : "+s1.area());
		System.out.println("사각형의 둘레 : "+s1.length());
	}

}
