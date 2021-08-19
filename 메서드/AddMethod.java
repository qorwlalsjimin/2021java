import java.util.Scanner;
public class AddMethod{
	public static void main( String args[]){
		Scanner scan= new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int b = scan.nextInt();
		int res=add(a,b,c); //result return됨
		System.out.println(a+"+"+b+"+"+c+"="+res); 
	}

	static int/*return되는 데이터타입 없으면 void*/ add( int aa, int bb, int cc){ //aa. bb: 매개변수 //순서대로 a는 aa, b는 bb
		int result=aa+bb+cc;
		//System.out.println(aa+"+"+bb+"+"+cc+"="+result);//이렇게도 출력됨
		return result;
	}
}
