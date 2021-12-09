package Class;

class Squarest{
	int width;
	int height;
	int idNum;
	static int Sqld = 0;
	
	Squarest(){
		++Sqld;
	}
}
public class Static_sample {

	public static void main(String[] args) {
		
		Squarest s1 = new Squarest();
		System.out.println(Squarest.Sqld);
	}

}
