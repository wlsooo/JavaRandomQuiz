package Exam;

public class exam_17_1 {
	//반을 나눠서 찍는 방법
	public static void main(String[] args) {
		for(int i=1; i<=5; i++){							// 5번 반복
			for(int j=5; j>i; j--)							// 공백이 있는 삼각형을 찍어준다
				System.out.print("  ");
			for(int k=1; k<=i; k++)
				System.out.print("* ");
			for(int j=1; j<i; j++)
				System.out.print("* ");						// 나머지 반의 *은 i보다 하나 작게 그냥 삼각형을 찍어준다
			System.out.print("\n");
		}
	}
}

