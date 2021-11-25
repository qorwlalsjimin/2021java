package Class;

class Box{
	//멤버변수
	int width;	
	int height;
	int depth;
	int clac_v(){
		return width*height*depth;
	}
	int clac_v(int t){ //오버로딩
		return width*height*depth*t;
	} 
	void volume(int times){
		System.out.println("밑변 가로 : "+width);
		System.out.println("밑변 세로 : "+height);
		System.out.println("높      이 : "+depth);
		System.out.println("box의 부피 : "+clac_v());
		System.out.println("box의 "+times+"배 부피 : "+clac_v(times));
		System.out.println();
	}
	Box(int width, int height, int depth){ //매개변수랑 멤버변수가 똑같으면 멤버변수에 this. 붙여주기
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

}
public class TwoBox {

	public static void main(String[] args) {

		Box b1 = new Box(1,2,3); //width, height, depth
		b1.volume(4);
		
		Box b2 = new Box(4,5,6);
		b2.volume(2);

	}

}
