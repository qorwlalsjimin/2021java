package Class;

import java.util.Scanner;

class dot{

	int x;
	int y;
	
	dot(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void move(int xm, int ym) {
		x += xm;
		y += ym;
	}
	
	void print() {
		System.out.println("("+x+", "+y+")");
	}
}

public class MakePoint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("x,y 좌표를 입력하시오 >> ");
		
		dot one = new dot(scan.nextInt(),scan.nextInt());
		one.print();
		
		System.out.print("이동할 값을 x,y 각각 입력하시오 >> ");
		int move_x = scan.nextInt();
		int move_y = scan.nextInt();
		
		one.move(move_x,move_y);
		one.print();
		
	}

}
