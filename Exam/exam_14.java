package Exam;

public class exam_14 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) { //중첩 for문
			for(int j=0; j<5-i; j++) { //*의 개수가 점점 줄어든다
				System.out.print("*");
			}
			System.out.println(); //Enter 역할
		}
	}
}

