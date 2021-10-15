package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		String[] sub_title = new String[]{"완성도", "창의성", "이해도"};

		int max=0, team=0;
		
		for(int i = 0; i<score.length; i++) {
			int space = 0;
			System.out.println("*"+(i+1)+"조 입력");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j] = scan.nextInt();
//				if(score[i][j]>20 || score[i][j]<0)
//					j--;
				while(score[i][j]>20 || score[i][j]<0) {
					System.out.println("다시 입력하시오.");
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
			System.out.print(i+1+"조 : ");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
		}
		System.out.println("\n\n최고팀 : "+team+"번째 팀 -> 점수 : "+max);
	}

}
