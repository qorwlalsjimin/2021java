public class ForExam2{
	public static void main( String args[]){

	int even_sum=0, odd_sum; //메모리는 쓰레기값이 들어있기때문에 초기화를 안 하면 어떤 계산을 해도 쓰레기
	for(int i = 1; i <= 10; i++)
		if( i % 2 == 0) even_sum += i;
		else odd_sum += i;
	System.out.println("1부터 10까지의 짝수 합은 "+even_sum+"이고, "+"홀수 합은 "+ odd_sum + "입니다.");

	}
}