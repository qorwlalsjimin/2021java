class Tri{
	int bottom;
	int heighet;
	
	double area(){
		return (double)bottom*heighet/2;
	}
}

public class Tri_Test {

	public static void main(String[] args) {
		Tri t1 = new Tri(); //t1 = 12bytes
		t1.bottom = 3;
		t1.heighet = 5;
		System.out.println(t1.area());
	}

}
