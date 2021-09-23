package Array;

import java.util.Scanner;

public class SelectionBubble {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] data = new int[] {3,2,7,1,5,4,6,1,2,3};

		for(int i = 0; i<data.length; i++)
			System.out.print(data[i]+" ");

		for(int i = data.length-2; i>=0; i--) {
			for(int j = 0; j<=i; j++) {
				if(data[j]>data[j+1]) {
					int temp = data[j]; //swap, 임시저장소
					data[j] = data[j+1];
					data[j+1] = temp;
				}	
			}
		}
		
		System.out.println();
		for(int i = 0; i<data.length; i++)
			System.out.print(data[i]+" ");

	}

}

//0 1
//1 2
//2 3
//3 4
//-----------------
//0 1
//1 2
//2 3
//-----------------
//0 1
//1 2
//-----------------
//0 1
