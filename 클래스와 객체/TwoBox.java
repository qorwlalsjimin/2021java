package Class;

class Box{
	//�������
	int width;	
	int height;
	int depth;
	int clac_v(){
		return width*height*depth;
	}
	int clac_v(int t){ //�����ε�
		return width*height*depth*t;
	} 
	void volume(int times){
		System.out.println("�غ� ���� : "+width);
		System.out.println("�غ� ���� : "+height);
		System.out.println("��      �� : "+depth);
		System.out.println("box�� ���� : "+clac_v());
		System.out.println("box�� "+times+"�� ���� : "+clac_v(times));
		System.out.println();
	}
	Box(int width, int height, int depth){ //�Ű������� ��������� �Ȱ����� ��������� this. �ٿ��ֱ�
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

}
public class TwoBox {

	public static void main(String[] args) {

		Box b1 = new Box(1,2,3); //width, height, depth
		b1.volume(4);
		
		Box b2 = new Box(4,5,6);
		b2.volume(2);

	}

}
