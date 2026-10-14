package exception;

public class ThrowsTest {

	public static void divide() throws Exception {
		int result = 10/0;
		System.out.println(result);
	}
	//try-catch문은 예외처리를 구문 내에 실행하지만 throws Exception은 이 메서드를 호출하는 측에서 예외처리를 하도록 함
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			divide();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
