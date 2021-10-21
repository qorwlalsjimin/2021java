package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3+2]; //총점 순위
		String[] sub_title = new String[]{"완성도", "창의성", "이해도"," 합계", "순위"};

		int max=0, team=0;
		
		//입력
		for(int i = 0; i<score.length; i++) {
			System.out.println("*"+(i+1)+"조 입력");
			score[i][3] = 0; //이건 뭥미
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
		
		//출력
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
			System.out.print(i+1+"조 : ");
			for(int j = 0; j<score[i].length-2; j++) {
				System.out.print("\t"+score[i][j]);
			}
			System.out.print("\t"+score[i][3]+"\t"+score[i][4]);
		}
		System.out.print("\n============================================");
		System.out.println("\n최고팀 : "+team+"번째 팀 -> 점수 : "+max);
	}

}
