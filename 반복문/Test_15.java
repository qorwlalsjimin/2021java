package Study;

public class Test_15 {

	public static void main(String[] args) {
		// while���� �̿��ؼ� 1���� �����հ谡 100�� �Ѵ� ���� ã�� ����Ͻÿ�.
		
//		int i = 1;
//		int tot = 0;
//		while(true) {
//			tot+=i;
//			if(tot>100) {
//				System.out.println(i+" "+tot);
//				break;
//			}//if
//			i++;
//		}//while
		
		int i = 0, sum = 0;
		
		while(sum<100) {
			sum += ++i;
		}

		System.out.println("i = "+i+", sum = "+sum);
	}

}
