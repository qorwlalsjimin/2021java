//1부터 100 사이의 홀수를 출력하는 프로그램
public class Whileodd1to100{
	public static void main( String args[]){
		int i = 1;
		while(i<=100){
			if(i%2!=0) System.out.print(i+" ");
			i++;
		}
	}
}