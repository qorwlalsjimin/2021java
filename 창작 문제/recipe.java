import java.util.Scanner;
public class recipe{
	public static void main( String args[]){
	Scanner scan = new Scanner(System.in);

	System.out.print("�κ� : ");
	int du = scan.nextInt();
	System.out.print("��ȣ�� : ");
	int ae= scan.nextInt();
	System.out.print("���� : ");
	int on= scan.nextInt();
	int Cnt = 0; //�� �κ�
	int duC = du/1; 
	int aeC = ae/2;
	int onC = on/3; 

	
	if(duC>aeC) Cnt=aeC;
	else Cnt=duC;

	if(Cnt>onC) Cnt=onC;

	System.out.println("\n�κ� "+du+"��, ��ȣ�� "+ae+"��, ���� "+on+"��");
	System.out.println("�� "+Cnt+"�κ��� ������� ���� �� �ֽ��ϴ�.");
	
	}
}