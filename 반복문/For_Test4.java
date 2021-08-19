import java.util.Scanner;
public class For_Test4{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);

		System.out.print("팩토리얼 계산 수 입력 ");
		int su = scan.nextInt();
		int s = fact(su); //s에 sum이 들어감
		System.out.println(s);
	}

	static int fact(int k){ //k=su
		if(k==1) return 1;
		else return k*fact(k-1);
	}
}

	/*
	static int fact(int k){ //k=10
		int sum = 1;
		for(int i=1; i<=k; i++)
			sum*=i;
		return sum;
	*/