package Exam;

public class exam_32 {
	public static void main(String[] args) {
		int[] score = {100, 88, 100, 100, 90};
		int sum = 0;
		double avg = 0.0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = (double)sum/score.length;
		System.out.println("합계 : " + sum + "  평균 : " + avg);
	}
}

