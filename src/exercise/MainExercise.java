package exercise;

import java.util.Scanner;

public class MainExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//입력된 점수가 0~100점 사이인지 검사하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
				
		try {
			int score = Integer.parseInt(sc.nextLine());
			if((score>=0) && (score<=100)) {
				System.out.println("정상적인 숫자입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("점수확인이 완료되었습니다.");
		}
	}

}
