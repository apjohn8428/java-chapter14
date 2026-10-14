package exception;

public class ThrowTest {

	public void checkAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException(); 
		}
		System.out.println("정상입력되었습니다.");
	}
}
