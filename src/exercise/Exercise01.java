package exercise;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); //콘솔 입력문 -> 입력된 sc값은 무조건 String으로 저장
		
		try {
			if(Integer.parseInt(sc.nextLine())>=20) {
				System.out.println("당신은 성인입니다.");
			} else {
				System.out.println("당신은 미성년입니다.");
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력하시오.");
		}
		
	}

}
