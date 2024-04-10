package Exam;

public class exam_34 {//exam_34 대신 Car 클래스를 만드시면 됩니다
	//속성
	String name;	//차주
	String color;	//색상
	int speed;		//속도
	//메서드
	public void speedUp() {//속도 10 증가
		this.speed += 10;	//this는 현재 클래스 안의 speed를 나타냅니다
	}	
	public void speedDown() {//속도 10 감소
		this.speed -= 10;
	}
	public void stop() {//차 정지
		this.speed = 0;
	}
}

