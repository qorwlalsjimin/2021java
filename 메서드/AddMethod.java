import java.util.Scanner;
public class AddMethod{
	public static void main( String args[]){
		Scanner scan= new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int b = scan.nextInt();
		int res=add(a,b,c); //result return��
		System.out.println(a+"+"+b+"+"+c+"="+res); 
	}

	static int/*return�Ǵ� ������Ÿ�� ������ void*/ add( int aa, int bb, int cc){ //aa. bb: �Ű����� //������� a�� aa, b�� bb
		int result=aa+bb+cc;
		//System.out.println(aa+"+"+bb+"+"+cc+"="+result);//�̷��Ե� ��µ�
		return result;
	}
}
