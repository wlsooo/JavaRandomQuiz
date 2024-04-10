package Exam;

class Student {
	String name;  //나이
	int num;  //학번
	int age;  //나이
	public void study() {
		System.out.println("학생이 공부를 합니다.");
	}
	public void exercise() {
		System.out.println("학생이 운동을 합니다.");
	}
	public void eat() {
		System.out.println("학생이 음식을 먹습니다.");
	}
}
//인스턴스 객체 생성
public class exam_35{
	public static void main(String args) {
		Student s1 = new Student();	//인스턴스 객체 생성
		s1.study();//메서드 호출
	} 
}

