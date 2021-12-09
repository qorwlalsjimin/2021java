package Class;

class Ex_class
{
	String car_name;
	private int size;
	
	void Set_size(int size) {
		this.size = size;
	}
	
	int Get_size() {
		return size;
	}
}

public class Sample_class {

	public static void main(String[] args) {
		
		Ex_class ex = new Ex_class();
		ex.car_name = "그랜져";
		ex.Set_size(2500);
//		ex.size = 2500;
//		System.out.println("차종 : "+ex.car_name+"크기 : "+ex.size);
		System.out.println("차종 : "+ex.car_name+", 크기 : "+ex.Get_size());

	}

}
