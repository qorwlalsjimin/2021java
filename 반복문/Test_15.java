package Study;

public class Test_15 {

	public static void main(String[] args) {
		// while문을 이용해서 1부터 누적합계가 100이 넘는 수를 찾아 출력하시오.
		
		int i = 1;
		int tot = 0;
		while(true) {
			tot+=i;
			if(tot>100) {
				System.out.println(i+" "+tot);
				break;
			}//if
			i++;
		}//while

	}

}
