package Array;

public class ArrayExam12 {

	public static void main(String[] args) {

		//int k = 1;
		int[][] one = new int[4][4];
		for(int i = 0; i<one.length; i++) {
			for(int j = 0; j<one[i].length; j++) {
				//one[i][j] = k++;
				one[i][j] = i*one[i].length+(j+1);
			}

		}
		
		System.out.println("-------------?ڹٽ???-------------");
		for(int i = 0; i<one.length; i++) {
			for(int j = 0; j<one[i].length; j++)
				System.out.print(one[i][j]+"\t");
			System.out.println();
		}//for

	}

}
