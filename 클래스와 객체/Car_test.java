package Class;

class Car{
	String modelname; //멤버 변수
	String producer;
	void speedup() { //멤버 메서드
		System.out.println(modelname+"SpeedUp");
	};
	void stop() {
		System.out.println(modelname+"Stop");
	};
	Car(){
		System.out.println("기본생성자");
	}
	Car(String model, String comp){ //생성자constructor //메서드와 비슷하지만 반환형은 없다. 매개변수는 있을 수도 있고 없을 수도 있다. 이름은 클래스와 똑같아야한다.
		modelname = model;			//매개변수를 멤버 변수에 저장시키는 것
		producer = comp;
	}
}

public class Car_test {

	public static void main(String[] args) {

		//Car morning = new Car(); //생성자
		Car morning = new Car("모닝","현대");
		//Car sm3 = new Car();
		Car sm3 = new Car("SM3", "삼성");
//		morning.modelname ="모닝";
//		morning.producer="현대";
		morning.speedup();
		morning.stop();
		
//		sm3.modelname ="SM3";
//		sm3.producer="삼성";
		sm3.speedup();
		sm3.stop();
	}//main

}//Car_test
