package Array;

public class ArrayExam13 {

	public static void main(String[] args) {
		
		int k = 1;
		int[][] one = new int[4][4];
		for(int i = 0; i<one.length; i++) {
			for(int j = 0; j<=i; j++) {
				one[i][j] = k++;
			}
		}
//		for(int i = 0; i<one.length; i++) {
//			for(int j = 0; j<=one[i].length; j++) {
//				one[i][j] = k++;
//				if(i==j) break;
//			}
//		}
		
		System.out.println("-------------자바실행-------------");
		for(int i = 0; i<one.length; i++) {
			for(int j = 0; j<=i; j++) 
				System.out.print(one[i][j]+"\t");
			System.out.println();
		}//for


	}

}
