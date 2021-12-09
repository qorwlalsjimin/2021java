package Class;

class Boxbox{
	int width;
	int height;
	int depth;
}

public class Box_main {

	public static void main(String[] args){
		int my_count1 = 100;
		int my_count2 = my_count1;
		Boxbox mybox1 = new Boxbox();
		Boxbox mybox2 = mybox1;
		
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 30;
		
		mybox2.height = 50;
		
		System.out.println(mybox1.width);
		System.out.println(mybox1.height);
		System.out.println(mybox1.depth);

	}

}
