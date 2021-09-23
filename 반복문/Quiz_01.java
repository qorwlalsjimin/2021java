package Study;

public class Quiz_01 {

	public static void main(String[] args) {
		
		// 100미만의 연속된 두 자릿수의 짝수 3개를 곱하였더니, 4****2가 되었다.
		// 이 세 개의 수는 어떤 수인지, 그리고 그 결과는 얼마인지 구하는 프로그램을
		// for문을 이용해서 작성하시오.
		int cnt=1;
		for(int i = 2; i<100; i+=2) {
			cnt = i*(i+2)*(i+4);
			if(cnt/100000==4 && cnt%10==2)
				System.out.println(i+" "+(i+2)+" "+(i+4));
		}

	}

}
