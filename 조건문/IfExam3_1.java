public class IfExam3_1{
	public static void main(String args[]){

	for(int i=0; i<args.length; i++)//0
		System.out.println(args[i]+" ");
	int a = args.length;
	if(a == 0 )
		System.out.println("����� �Ű������� �Է��ϼ���");
	else {
		System.out.print("�Էµ� ����� �Ű������� ");
		for(int i=0; i<args.length; i++)
			System.out.print(args[i]+" ");
		System.out.println("�Դϴ�.");
	}

	}
}