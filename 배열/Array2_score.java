package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		String[] sub_title = new String[]{"�ϼ���", "â�Ǽ�", "���ص�"};

		int max=0, team=0;
		
		for(int i = 0; i<score.length; i++) {
			int space = 0;
			System.out.println("*"+(i+1)+"�� �Է�");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j] = scan.nextInt();
//				if(score[i][j]>20 || score[i][j]<0)
//					j--;
				while(score[i][j]>20 || score[i][j]<0) {
					System.out.println("�ٽ� �Է��Ͻÿ�.");
					System.out.print(sub_title[j]+" : ");
					score[i][j] = scan.nextInt();
				}//while
				space += score[i][j];
			}//for
			if(max<space) {
				max = space;
				team = i+1;
			}//if
		}//for
		
		for(int i = 0; i<score.length; i++) {
			System.out.println();
			System.out.print(i+1+"�� : ");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
		}
		System.out.println("\n\n�ְ��� : "+team+"��° �� -> ���� : "+max);
	}

}
