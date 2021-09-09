package Array;
import java.util.Scanner;
public class Array_max {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) 
			arr[i] = scan.nextInt();
		
		int max=arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println(max);
		
	}

}
