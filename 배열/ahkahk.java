package Array;

import java.util.Scanner;

public class ahkahk {

	public static void main(String[] args) {
		//�ְ��� : 2��° �� -> ���� : 16
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		int[] sum = new int[score.length];
		String[] title = new String[]{"�ϼ���", "â�Ǽ�", "���ص�","�հ�","����"};
		
		int winner=0, max = 0;
		for(int i = 0; i<score.length; i++) {
			System.out.println(i+1+"�� �Է��Ͻÿ�.");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(title[j]+" : ");
				score[i][j] = scan.nextInt();
				if(score[i][j]<0 || score[i][j]>20)
					j--;
				else
					sum[i] += score[i][j];
			}
			if(max<sum[i]) {
				winner = i+1;
				max = sum[i];
			}
		}
		
		int[] rank = new int[score.length];
		for(int i = 0; i<rank.length; i++)
			rank[i] = 1;
		for(int i = 0; i<rank.length-1; i++) {
			for(int j = i+1; j<rank.length; j++) {
				if(sum[i]<sum[j])
					rank[i]++;
				else if(sum[i]>sum[j])
					rank[j]++;
			}
		}
		
		System.out.println("============================================");
		for(int i = 0; i<title.length; i++)
			System.out.print("\t"+title[i]);
		System.out.println("\n============================================");
		for(int i = 0; i<score.length; i++) {
			System.out.print(i+1+"�� : ");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print("\t"+score[i][j]);
			}
			System.out.println("\t"+sum[i]+"\t"+rank[i]);
			System.out.println();
		}
		System.out.println("============================================");
		System.out.println("�ְ��� : "+winner+"��° �� -> ���� : "+max);
	}

}