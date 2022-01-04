package test.arr2;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int stucnt = sc.nextInt();
		int[][] score = new int[stucnt][];
		String[] name = new String[stucnt];
		int[] sum = new int[stucnt];
		int subNum;
		for(int i = 0; i<score.length; i++) {
			System.out.print("학생 이름 : ");
			name[i] = sc.next();
			System.out.print("과목 수 : ");
			subNum = sc.nextInt();
			score[i] = new int[subNum];
			
			for(int j = 0; j<score[i].length; j++) {
				System.out.print("점수 : ");
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			}
			System.out.println();
		}
		
		for(int i = 0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j<score[i].length; j++)
				System.out.print(score[i][j]+"\t");
			System.out.println();
			System.out.println("합계 : "+sum[i]+"\t");
			System.out.printf("평균 : %.1f\n", (double)sum[i]/score[i].length);
		}
		
		sc.close();

	}

}
