package Exam;

public class exam_16 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" "); //공백을 0~4개 순으로 출력
			}
			for(int k=5; k>=i; k--) {
				System.out.print("*"); //*을 1~5개 순으로 출력
			}
			System.out.println();	//Enter 역할
		}
	}
}


