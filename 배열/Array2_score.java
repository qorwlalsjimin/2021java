package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("인원 수 입력 : ");
		int inwon = scan.nextInt();
		System.out.print("평가 항목 수 입력 : ");
		int content = scan.nextInt();
		int[][] score = new int[inwon][content+2]; //총점 순위
		String[] sub_title = new String[]{"완성도", "창의성", "이해도","발표력","공공성", "합계", "순위"};

		int max=0, team=0;
		
		//입력
		int tot = content; //0 1 2 항목수 번째 방이 합계방 score[i].length-2도 됨
		int rank = content+1;
		for(int i = 0; i<score.length; i++) {
			System.out.println("*"+(i+1)+"조 입력");
			score[i][tot] = 0; //이건 뭥미
			for(int j = 0; j<score[i].length-2; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j] = scan.nextInt();
				if(score[i][j]>20 || score[i][j]<0) {
					j--;
					score[i][tot] = 0;
				}
				else
					score[i][tot] += score[i][j];
			}//for j
			if(max<score[i][tot]) {
				max = score[i][tot];
				team = i+1;
			}//if
		}//for i
		
		for(int i = 0; i<score.length; i++)
			score[i][rank] = 1;
		for(int i = 0; i<score.length-1; i++) {
			for(int j = i+1; j<score.length; j++) {
				if(score[i][tot]<score[j][tot])
					score[i][rank]++;
				else if(score[i][tot]>score[j][tot])
					score[j][rank]++;
			}//for
		}//for
		
		//출력
		int line_su = 22+content*8;
		line(line_su, '&');
		for(int k = 0; k<content; k++)
			System.out.print("\t"+sub_title[k]);
		System.out.println();
		line(line_su, '#');
		for(int i = 0; i<score.length; i++) {
			System.out.println();
			System.out.print(i+1+"조 : ");
			for(int j = 0; j<score[i].length-2; j++) {
				System.out.print("\t"+score[i][j]);
			}
			System.out.print("\t"+score[i][tot]+"\t"+score[i][rank]);
		}
		System.out.println();
		line(line_su, '*');
		System.out.println("\n최고팀 : "+team+"번째 팀 -> 점수 : "+max);
	}
	
	static void line(int su, char ch) {
		System.out.println();
		for(int i = 0; i<su; i++)
			System.out.print(ch);
		System.out.println();
	}

}
