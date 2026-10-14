package exception;

public class TryCatchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = null;
		
//		System.out.println(name.length()); -> nullpointerexception이 에러를 확인
		
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			System.out.println("name값이 비어있습니다.");
		}
	}

}
