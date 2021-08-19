public class For_Test3{
	public static void main( String args[]){

	double sum = 1;
	System.out.print(1);
	for(int k=2; k<=100; k++){
		System.out.print("+(1/"+k+")");	
		sum += 1/(double)k;
	}

	System.out.print("="+sum);
	}
}

/*
1+(1/2)+(1/3)+...+(1/100)=@@.@@@@
*/