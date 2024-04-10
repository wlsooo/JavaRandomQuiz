package Exam;

import java.util.Scanner;

public class exam_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		if(score>=90)		System.out.println("A");
		else if(score>=80)	System.out.println("B");
		else if(score>=70)	System.out.println("C");
		else				System.out.println("D");
	}
}

