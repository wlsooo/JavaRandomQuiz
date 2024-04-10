package Exam;

public class exam_15 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int k=5; k>=i; k--) {
				System.out.print(" "); //공백을 4~1개 순으로 출력
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*"); //별을 1~5개 순으로 출력
			}
			System.out.println();	//Enter 역할
		}
	}
}



