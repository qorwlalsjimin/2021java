package Class;

class Car{
	String modelname; //��� ����
	String producer;
	void speedup() { //��� �޼���
		System.out.println(modelname+"SpeedUp");
	};
	void stop() {
		System.out.println(modelname+"Stop");
	};
	Car(){
		System.out.println("�⺻������");
	}
	Car(String model, String comp){ //������constructor //�޼���� ��������� ��ȯ���� ����. �Ű������� ���� ���� �ְ� ���� ���� �ִ�. �̸��� Ŭ������ �Ȱ��ƾ��Ѵ�.
		modelname = model;			//�Ű������� ��� ������ �����Ű�� ��
		producer = comp;
	}
}

public class Car_test {

	public static void main(String[] args) {

		//Car morning = new Car(); //������
		Car morning = new Car("���","����");
		//Car sm3 = new Car();
		Car sm3 = new Car("SM3", "�Ｚ");
//		morning.modelname ="���";
//		morning.producer="����";
		morning.speedup();
		morning.stop();
		
//		sm3.modelname ="SM3";
//		sm3.producer="�Ｚ";
		sm3.speedup();
		sm3.stop();
	}//main

}//Car_test
