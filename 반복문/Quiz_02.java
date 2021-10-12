package Study;

public class Quiz_02 {

	public static void main(String[] args) {

		//1116 2556 2880
		int cnt = 0;
		for(int i = 1000; i<10000; i++) {
			if(i/10%10 == i/100%10 && (i % 9 == 0)) {
				if(cnt % 10 == 0)
					System.out.println();
				System.out.print(i+" ");
				cnt++;
			}

			}//for
		System.out.println("\n°¹¼ö : "+cnt);
	}

}
