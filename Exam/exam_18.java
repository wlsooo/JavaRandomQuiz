package Exam;

public class exam_18 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++){							// 5번 반복
			for(int j=1; j<=4-i; j++)						// 공백을 4개부터 한개씩 적게 찍는다
				System.out.print(" ");
			for(int k=1; k<=(i*2)-1; k++)					// *은 i*2-1 라는 규칙성을 이용하여 찍는다
				System.out.print("*");
			System.out.print("\n");							// 한 줄을 찍으면 줄을 바꿔준다.
		}
		//다음 사진 이어서
		for(int i=0; i<4; i++) {
			for(int j=1; j<=1+i; j++) {
				System.out.print(" ");
			}
			for(int k=3; k>=(i*2)-1; k--) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}
}

