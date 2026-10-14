package exercise;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1; //해결책2: 전역변수를 초기화
		int num2;
		
		try {
			System.out.println("첫 번째 숫자를 입력하세요:");
			num1 = sc.nextInt();
			
			System.out.println("두 번째 숫자를 입력하세요:");
			num2 = sc.nextInt();
			
			System.out.println("두 숫자의 합:" + (num1 + num2)); //해결책 1: try문에 대입
		} catch (Exception e) {
			System.out.println("정수 숫자만 입력 가능합니다. 다시 확인하세요.");
		}
		
//		System.out.println("두 숫자의 합:" + (num1 + num2)); 두 변수가 초기화되지 않았을 경우에 따라 오류 발생
		
		sc.close(); //sc 객체 닫기 -> scanner 사용 종료
		
	}

}
