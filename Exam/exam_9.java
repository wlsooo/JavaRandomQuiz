package Exam;

import java.util.Scanner;

public class exam_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		switch(score/10) { //score을 10으로 나누어 십의 자리를 구한다
		case 10: case 9:											System.out.println("A");	break;
		case 8:														System.out.println("B");	break;
		case 7:														System.out.println("C");	break;
		case 6: case 5: case 4: case 3: case 2: case 1: case 0:		System.out.println("D");	break;
		
		}
	}
}


