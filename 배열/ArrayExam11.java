package Array;

public class ArrayExam11 {

	public static void main(String[] args) {

		int[][] one = new int[4][4];
		for(int i = 0; i<one.length; i++) {
			for(int j = 0; j<one[i].length; j++)
				one[i][j] = 1;
		}
		
		System.out.println("--------자바실행---------");
		for(int i = 0; i<one.length; i++) {
			if(i != 0) System.out.println();
			for(int j = 0; j<one[i].length; j++)
				System.out.print(one[i][j]+" ");
		}

	}

}
