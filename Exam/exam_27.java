package Exam;

public class exam_27 {
	public static void main(String[] args) {
		int[] num = new int[]{97, 94, 100, 96, 90, 93};
		int max = num[0];
		int min = num[0];
		for(int i=1; i<5; i++) {
			if(max>num[i]) {
				max = num[i];
			}
		}
		for(int i=1; i<5; i++) {
			if(min<num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max + "  최소값 : " + min);
	}
}

