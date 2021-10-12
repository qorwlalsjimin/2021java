package Study;

public class Quiz_02 {

	public static void main(String[] args) {

		//1116 2556 2880
		int h, t, cnt = 0;
		for(int i = 1000; i<10000; i++) {
			h = i/10%10;
			t = i/100%10;
			if(h == t && (i % 9 == 0)) {
				System.out.print(i+" ");
				cnt++;
				if(cnt % 10 == 0)
					System.out.println();
			}

			}//for
		System.out.println("\nÃÑ °¹¼ö´Â "+cnt+"°³ÀÔ´Ï´Ù.");
	}

}
