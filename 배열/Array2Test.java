package test.arr2;

public class Array2Test {

	public static void main(String[] args) {
		String[][] favs = {{"��","������","�䳢","����"},{"���","�ٳ���","��","Ű��"},{"��","����","����","�ܿ�"}};
		
		for(int i = 0; i<favs.length; i++) {
			for(int j = 0; j<favs[i].length; j++) {
				System.out.print(favs[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] favs2 = new int[3][2];
		int count = 1;
		
		for(int i = 0; i<favs2.length;i++) {
			for(int j = 0; j<favs2[i].length; j++) {
				favs2[i][j] = count++ * 10;
			}
		}
		
		for(int i = 0; i<favs2.length;i++) {
			for(int j = 0; j<favs2[i].length; j++) {
				System.out.print(favs[i][j] + " ");
			}
			System.out.println();
		}
	}

}
