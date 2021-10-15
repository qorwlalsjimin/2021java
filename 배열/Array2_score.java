package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		int[] tot = new int[score.length];
		String[] sub_title = new String[]{"�ϼ���", "â�Ǽ�", "���ص�"," �հ�", "����"};

		int max=0, team=0;
		
		for(int i = 0; i<score.length; i++) {
			System.out.println("*"+(i+1)+"�� �Է�");
			tot[i] = 0;
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j] = scan.nextInt();
//				if(score[i][j]>20 || score[i][j]<0) {
//					j--;
//					space = 0;
//				}
				while(score[i][j]>20 || score[i][j]<0) {
					System.out.println("�ٽ� �Է��Ͻÿ�.");
					System.out.print(sub_title[j]+" : ");
					score[i][j] = scan.nextInt();
				}//while
				tot[i] += score[i][j];
			}//for
			if(max<tot[i]) {
				max = tot[i];
				team = i+1;
			}//if
		}//for
		
		//���
		int[] rank = new int[score.length];
		for(int i = 0; i<score.length; i++)
			rank[i] = 1;
		for(int i = 0; i<score.length-1; i++) {
			for(int j = i+1; j<score.length; j++) {
				if(tot[i]<tot[j])
					rank[i]++;
				else if(tot[i]>tot[j])
					rank[j]++;
			}//for
		}//for
		
		System.out.println("============================================");
		for(int k = 0; k<sub_title.length; k++)
			System.out.print("\t"+sub_title[k]);
		System.out.print("\n============================================");
		for(int i = 0; i<score.length; i++) {
			System.out.println();
			System.out.print(i+1+"�� : ");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print("\t"+score[i][j]);
			}
			System.out.print("\t"+tot[i]+"\t"+rank[i]);
		}
		System.out.print("\n============================================");
		System.out.println("\n�ְ��� : "+team+"��° �� -> ���� : "+max);
	}

}
