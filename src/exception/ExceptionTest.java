package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
	//	int result = num/0; 0나누기 에러
		
		int[] nums = {10,20,30,40,50};
		
	//	System.out.println(nums[5]); out of bounds 에러
		
		String str = "abc";
		
		int score = Integer.parseInt(str); //에러가 날 수 있는 코드
	}

}
