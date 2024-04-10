package Exam;

public class exam_13 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) { //중첩 for문
			for(int j=0; j<i+1; j++) { 	
				System.out.print("*");
			}
			System.out.println(); //Enter 역할
		}
	}
}

