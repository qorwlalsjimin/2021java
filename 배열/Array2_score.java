package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		int max=0, team=0;
		
		for(int i = 0; i<score.length; i++) {
			int space = 0;
			System.out.print(i+1+"�� >> ");
			for(int j = 0; j<score[i].length; j++) {
				score[i][j] = scan.nextInt();
				while(score[i][j]>20 || score[i][j]<0) {
					System.out.println("�ٽ� �Է��Ͻÿ�.");
					score[i][j] = scan.nextInt();
				}//if
				space += score[i][j];
			}//for
			if(max<space) {
				max = space;
				team = i+1;
			}//if
		}//for
		System.out.println("�ְ��� : "+team+"��° �� -> ���� : "+max);
	}

}
