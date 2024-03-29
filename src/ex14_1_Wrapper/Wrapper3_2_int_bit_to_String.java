/*
 * 		int - > String 만드는 방법 두 가지
 * 			방법1. Integer.toString() 사용
 * 			방법2. + 연산자 사용
 */
package ex14_1_Wrapper;
public class Wrapper3_2_int_bit_to_String {
	public static void main(String args[]) {
		
		int i = 10;
		// 방법 1. Integer.toString() 사용
		String age = Integer.toString(i);
		
		// 방법 2. + 연산자 사용
		String age2 = "" + i;
		
		System.out.println(age);
		System.out.println(age2);
	}
}
