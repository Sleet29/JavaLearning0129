// Wrapper 객체 -> 기본형 값으로 자동(오토) Unboxing 하는 예
// 기본형의 값을 써야 할 자리에 Wrapper 객체를 사용하면
// 그 Wrapper 객체로부터 기본형의 값이 자동으로 추출되어 사용됩니다.

package ex14_1_Wrapper;
public class Wrapper7 {
	public static void main(String args[]) {
		
		// double 타입의 값을 가지고 Double 타입 매개변수를 사용하는 메소드를 호출
		printDouble(123.45);
		// printDouble(Double.valueOf(123.456D));로 변환됨
	}
	
	// 자동(오토) Boxing
	static void printDouble(Double obj) {
		System.out.println("obj.doubleValue() = " + obj.doubleValue());
		System.out.println("obj.toString() = " + obj.toString());
	}
}