package exercise;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//입력받은 숫자의 홀수, 짝수 여부 판별 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		String str = sc.nextLine();
		
		try { //정수로 변환이 되지 않을 경우에 대한 예외처리
			int number = Integer.parseInt(str);
			
			if(number%2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} catch (NumberFormatException e) {
			System.out.println("정수만 입력 가능합니다.");
			
			e.printStackTrace();
			
		}
		
		sc.close();
		System.out.println("프로그램 정상종료");
	}

}
