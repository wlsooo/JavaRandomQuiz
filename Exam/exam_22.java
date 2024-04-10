package Exam;

public class exam_22 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += num%10;	//각 자리의 숫자를 더함
			num /= 10;		//더한 후 나누어줌
		}
		System.out.println(sum);
	}
}	

