package Exam;

import java.util.Scanner;

public class exam_31 {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<strArr.length; i++) {
			System.out.print(i+1 + "번째 이름을 입력하세요 > ");
			strArr[i] = scan.next(); //String타입을 입력받을 땐 next만 써준다
		}
		for(int j=0; j<strArr.length; j++) {
			System.out.println(j+1 + "번째 이름 : " + strArr[j]);
		}
	}
}

