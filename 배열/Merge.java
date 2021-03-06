package Array;
import java.util.Scanner;
public class Merge { //병합

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[10];
		
		//데이터 입력
		System.out.print("첫번째 배열 (숫자 5개) 입력 >> ");
		for(int i = 0; i<a.length; i++) 
			a[i] = scan.nextInt();
		System.out.print("두번째 배열 (숫자 5개) 입력 >> ");
		for(int i = 0; i<b.length; i++) 
			b[i] = scan.nextInt();
		
		//a, b 오름차순 정률
		sort(a);
		sort(b);
		
		//정렬 후 a,b 출력
		for(int i = 0; i<a.length; i++) 
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i = 0; i<b.length; i++) 
			System.out.print(b[i]+" ");
			
		//a,b 병합
		//merge();
 		int x = 0, y = 0, z = 0;
 		while(true){
 			if(a[x]<b[y]) {
 				c[z] = a[x];
 				x++; z++;
 			}
 			else if(a[x]>b[y]) {
 				c[z] = b[y];
 				y++; z++;
 			}
 			else {
 				c[z] = b[y];
 				x++; y++; z++;
 			}
 			
 			if(x==a.length || y==b.length)
 				break;
 		}
 		
 		//남은 c방에 다 못들어간 나머지 데이터값 대입
		if(x==a.length) {
 			for(int i = y; i<b.length; i++) {
 				c[z] = b[i];
 				z++;
 			}
 		}
 		else {
 			for(int i = x; i<a.length; i++) {
 				c[z] = a[i];
 				z++;
 			}
 		}
		
		//정렬 후 c 출력
		System.out.println();
		for(int i = 0; i<c.length && c[i]!=0; i++)
			System.out.print(c[i]+" ");
	}//main

	static void sort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}//if
			}//for
		}//for
	}//sort
}
