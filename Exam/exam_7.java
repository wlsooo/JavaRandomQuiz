package Exam;

import java.util.Scanner;

public class exam_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //변수 선언, 사용자에게 입력 받기
		System.out.println((num%2==0) ? "짝수" : "홀수");
	}
}

