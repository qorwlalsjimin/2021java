package Study;

public class Quiz_01 {

	public static void main(String[] args) {
		
		// 100�̸��� ���ӵ� �� �ڸ����� ¦�� 3���� ���Ͽ�����, 4****2�� �Ǿ���.
		// �� �� ���� ���� � ������, �׸��� �� ����� ������ ���ϴ� ���α׷���
		// for���� �̿��ؼ� �ۼ��Ͻÿ�.
		int cnt=1;
		for(int i = 2; i<100; i+=2) {
			cnt = i*(i+2)*(i+4);
			if(cnt/100000==4 && cnt%10==2)
				System.out.println(i+" "+(i+2)+" "+(i+4));
		}

	}

}
