package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		int[] sum = new int[5];
		String[] sub_title = new String[]{"완성도", "창의성", "이해도"," 합계"};

		int max=0, team=0;
		
		for(int i = 0; i<score.length; i++) {
			System.out.println("*"+(i+1)+"조 입력");
			sum[i] = 0;
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j] = scan.nextInt();
//				if(score[i][j]>20 || score[i][j]<0) {
//					j--;
//					space = 0;
//				}
				while(score[i][j]>20 || score[i][j]<0) {
					System.out.println("다시 입력하시오.");
					System.out.print(sub_title[j]+" : ");
					score[i][j] = scan.nextInt();
				}//while
				sum[i] += score[i][j];
			}//for
			if(max<sum[i]) {
				max = sum[i];
				team = i+1;
			}//if
		}//for
		
		//출력
		System.out.println("=========================================");
		for(int k = 0; k<sub_title.length; k++)
			System.out.print("\t"+sub_title[k]);
		System.out.print("\n=========================================");
		for(int i = 0; i<score.length; i++) {
			System.out.println();
			System.out.print(i+1+"조 : \t");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(sum[i]);
		}
		System.out.println("\n=========================================");
		System.out.println("\n최고팀 : "+team+"번째 팀 -> 점수 : "+max);
	}

}
