public class IfExam3_1{
	public static void main(String args[]){

	for(int i=0; i<args.length; i++)//0
		System.out.println(args[i]+" ");
	int a = args.length;
	if(a == 0 )
		System.out.println("명령행 매개변수를 입력하세요");
	else {
		System.out.print("입력된 명령행 매개변수는 ");
		for(int i=0; i<args.length; i++)
			System.out.print(args[i]+" ");
		System.out.println("입니다.");
	}

	}
}