package Array;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[100];
		int cnt = 0, cal;
		for(int i = 0; i<a.length; i++) {
			a[i]=(i+1);
			if(a[i]%2==0)
				cal = -1*a[i];
			else
				cal = a[i];
			cnt += cal;
		}
		System.out.println(cnt);
	}

}
