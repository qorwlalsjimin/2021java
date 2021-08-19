public class Logical_Test{
	public static void main( String args[]){
		/*
		int a=10;
		System.out.println(a>10 | (a=20)==20); //f
		System.out.println(a); //&&[||] : 10(앞이 거짓이면 뒤는 안 봄), &[|] : 20(둘다 보고 판단)
		*/

		/*
		int a=10;
		System.out.println((a=20)==20);
		//System.out.println(!a);
		System.out.println(a);

		boolean power=false;
		System.out.println(power); //f
		System.out.println(!power); //t
		System.out.println(!!power); //f
		*/

		int a =10;
		int b = 5;
		b=b+ ++a;

		System.out.println(a); //11
		System.out.println(b); //16

		a=10;
		b=5;

		b=b+ a++;

		System.out.println(a); //11
		System.out.println(b); //15
	}
}