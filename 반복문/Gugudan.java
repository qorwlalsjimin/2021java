public class Gugudan{
	public static void main( String args[]) {

	for(int i=2; i<=9; i++){
		System.out.print(i+"´Ü");

		int a=17;
		int b=20;

		lineprint(a, '@');
		lineprint(b, '-');

		for(int j=1; j<=9; j++)
			System.out.println(i+"*"+j+"="+(i*j));

		lineprint(b, '=');
	}
	}
        
	
	static void lineprint(int su, char c){
		for(int i =1; i<=su; i++)
			System.out.print(c);
		System.out.println();
	}

	
}