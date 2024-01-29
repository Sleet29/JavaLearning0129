// 문자열로 입력된 값을 연산 처리하기 위한 방법?
package ex14_1_Wrapper;
public class Wrapper2_2_String_to_int {
	public static void main(String args[]) {
		/*
		 * Integer 객체를 이용한 String -> int 방법 두 가지
		 * 
		 * 방법1.
		 * 		(1) String -> Integer 객체
		 * 		(2) Integer 객체 -> int형 값
		 * 
		 * 방법2.
		 * 		String -> int
		 * 		예)Integer.parseInt(args[cnt])
		 */
		
		
		int total = 0;
		
		// 방법1.
		//	(1) String -> Integer 객체
		//	(2) Integer 객체 -> int형 값
		for (int cnt = 0; cnt <args.length; cnt++) {
			System.out.println("args[" + cnt + "]=" + args[cnt]);
			
			// 인자로 받은 문자열을 가지고 Integer 객체를 생성
			Integer obj = Integer.valueOf(args[cnt]);
			
			// Integer 객체 안에 있는 int 값을 가져옴
			total += obj.intValue();
		}
		System.out.println("합 = "+total);
		System.out.println("=========================================================");
		
		// 방법2.
		
		
		total = 0;
		for (int cnt = 0; cnt <args.length; cnt++) {
			// 에러 발생(String -> int 형변환 요구)
			total = Integer.parseInt(args[cnt])+ total;
		}
		System.out.println("합 = "+total);
		
		System.out.println("=========================================================");
		
		
	}
}
