package Array;

public class SelectionSort {

	public static void main(String[] args) {

		int[] data = new int[] {3,2,4,7,1};
		for(int i = 0; i<data.length; i++)
			System.out.print(data[i]+" ");

		for(int i = 0; i<data.length-1; i++) {
			for(int j = i+1; j<data.length; j++) {
				if(data[i]>data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}	
			}
		}
		
		System.out.println();
		for(int i = 0; i<data.length; i++)
			System.out.print(data[i]+" ");
	}

}