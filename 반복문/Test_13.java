package Study;

public class Test_13 {

	public static void main(String[] args) {
		// 1~100 ������ ������ 3�� ����̸鼭, 5�� ����� ���� ����ϰ�
		// �� ������ ������ ����Ͻÿ�
		// for���� �̿��� ��
		
		int cnt = 0, tot = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
				cnt++;
				tot += i;
			}//if
		}//for
		
		System.out.println();
		System.out.println("���� : "+cnt);
		System.out.println("���� : "+tot);

	}

}
