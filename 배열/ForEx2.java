package Array;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			cnt += arr[i];
		}
		System.out.println(cnt);
	}
}
