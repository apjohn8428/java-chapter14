package exercise;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); //scanner클래스로 만든 sc 객체 선언
		
		System.out.print("당신의 이름을 입력하세요:");
		String str = sc.nextLine(); //키보드에서 입력한 값을 문자열로 반환하는 메서드
		
		System.out.print("당신의 이름:" + str);	
		
		System.out.print("당신의 나이를 입력하세요:");
		int age = sc.nextInt(); //키보드에서 입력한 정수값을 정수형으로 반환하는 메서드 -> 문자열에 대한 예외처리 필요
		
		System.out.print("당신의 이름:" + age);
	}

}
