package Exam;

import java.util.Scanner;

public class exam_23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요(스페이스로 구분) : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(num1 > num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}
}

