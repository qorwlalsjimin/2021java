package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3+2]; //���� ����
		String[] sub_title = new String[]{"�ϼ���", "â�Ǽ�", "���ص�"," �հ�", "����"};

		int max=0, team=0;
		
		//�Է�
		for(int i = 0; i<score.length; i++) {
			System.out.println("*"+(i+1)+"�� �Է�");
			score[i][3] = 0; //�̰� �o��
			for(int j = 0; j<score[i].length-2; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j] = scan.nextInt();
				if(score[i][j]>20 || score[i][j]<0) {
					j--;
					score[i][3] = 0;
				}
				else
					score[i][3] += score[i][j];
			}//for j
			if(max<score[i][3]) {
				max = score[i][3];
				team = i+1;
			}//if
		}//for i
		
		//���
		for(int i = 0; i<score.length; i++)
			score[i][4] = 1;
		for(int i = 0; i<score.length-1; i++) {
			for(int j = i+1; j<score.length; j++) {
				if(score[i][3]<score[j][3])
					score[i][4]++;
				else if(score[i][3]>score[j][3])
					score[j][4]++;
			}//for
		}//for
		
		System.out.println("============================================");
		for(int k = 0; k<sub_title.length; k++)
			System.out.print("\t"+sub_title[k]);
		System.out.print("\n============================================");
		for(int i = 0; i<score.length; i++) {
			System.out.println();
			System.out.print(i+1+"�� : ");
			for(int j = 0; j<score[i].length-2; j++) {
				System.out.print("\t"+score[i][j]);
			}
			System.out.print("\t"+score[i][3]+"\t"+score[i][4]);
		}
		System.out.print("\n============================================");
		System.out.println("\n�ְ��� : "+team+"��° �� -> ���� : "+max);
	}

}
