package Array;
import java.util.Scanner;
public class Merge { //����

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[10];
		
		//������ �Է�
		System.out.print("ù��° �迭 (���� 5��) �Է� >> ");
		for(int i = 0; i<a.length; i++) 
			a[i] = scan.nextInt();
		System.out.print("�ι�° �迭 (���� 5��) �Է� >> ");
		for(int i = 0; i<b.length; i++) 
			b[i] = scan.nextInt();
		
		//a, b �������� ����
		int temp;
		for(int i = 0; i<a.length-1; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = b.length-2; i>=0; i--) {
			for(int j = 0; j<=i; j++) {
				if(b[j]>b[j+1]) {
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}	
			}
		}
		//���� �� a,b ���
		for(int i = 0; i<a.length; i++) 
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i = 0; i<b.length; i++) 
			System.out.print(b[i]+" ");
			
		//a,b ����
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
 		
 		//���� c�濡 �� ���� ������ �����Ͱ� ����
		if(x==a.length) {
 			for(int i = y; i<b.length; i++) {
 				c[z] = b[y];
 				z++; b[y]++;
 			}
 		}
 		else {
 			for(int i = x; i<a.length; i++) {
 				c[z] = a[x];
 				z++; a[x]++;
 			}
 		}
		
		//���� �� c ���
		System.out.println();
		for(int i = 0; i<c.length; i++)
			System.out.print(c[i]+" ");
	}

}
