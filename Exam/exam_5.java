package Exam;

import java.util.Scanner;

public class exam_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("현재 잔액 : ");
		int money = scan.nextInt(); //int money; money = scan.nextInt();를 합쳐서 씀
		if(money>=1000)		System.out.println("초콜릿");
		else if(money>=500)	System.out.println("아이스크림");
		else if(money>=300)	System.out.println("돌사탕");
		else				System.out.println("살 수 있는게 없습니다.");
	}	
}


