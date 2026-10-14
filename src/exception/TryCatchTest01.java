package exception;

public class TryCatchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//예외처리문의 기본 문법 try-catch-finally문 
		int num1 = 10;
		int num2 = 5; //외부에서 받아오는 값이라 가정
	//	int result = num1 / num2; 에러발생 가능성 존재
		
		try {
			int result = num1 / num2;
			System.out.println(result);
			int[] nums = {10,20,30,40,50};
			System.out.println(nums[4]);
		} catch(Exception e) { //다양한 예외처리 메서드가 있지만 부모클래스인 exception으로 처리 가능하다
			System.out.println("오류가 발생했습니다.");
			e.printStackTrace(); //해당 오류메시지 출력
		} finally { //finally는 생략가능하다
			//try문의 에러 여부와 상관없이 무조건 실행된다
			System.out.println("finally문");
		}
		
		System.out.println("프로그램이 계속 실행됩니다.");
	}

}
