package Study;

public class Test_15 {

	public static void main(String[] args) {
		// while���� �̿��ؼ� 1���� �����հ谡 100�� �Ѵ� ���� ã�� ����Ͻÿ�.
		
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
